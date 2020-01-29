#include <SPI.h>
#include <Ethernet.h>
int led = 4;
int pos = 0; 
byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };  
byte ip[] = { 192, 168, 31, 5};                             
EthernetServer server(80);                               
String readString;

void setup() {
  Serial.begin(9600);
  pinMode(led, OUTPUT);
  Ethernet.begin(mac, ip);
  server.begin();
  Serial.print("server is at ");
  Serial.println(Ethernet.localIP());
}


void loop() {
  // Create a client connection
  EthernetClient client = server.available();
  if (client) {
    while (client.connected()) {   
      if (client.available()) {
        char c = client.read();
     
        //read char by char HTTP request
        if (readString.length() < 100) {
          //store characters to string
          readString += c;
          //Serial.print(c);
         }

         //if HTTP request has ended
         if (c == '\n') {          
           Serial.println(readString); //print to serial monitor for debuging
     
           client.println("HTTP/1.1 200 OK"); //send new page
           client.println("Content-Type: text/html");
           client.println();     
           client.println("<HTML>");
           client.println("<HEAD>");
           client.println("<meta name='apple-mobile-web-app-capable' content='yes' />");
           client.println("<meta name='apple-mobile-web-app-status-bar-style' content='black-translucent' />");
           client.println("<link rel='stylesheet' type='text/css' href='http://randomnerdtutorials.com/ethernetcss.css' />");
           client.println("<TITLE>TEJ3U Security System</TITLE>");
           client.println("</HEAD>");
           client.println("<BODY>");
           client.println("<H1>Get ready to be amazed</H1>");
           client.println("<hr />");
           client.println("<br />");  
           client.println("<H2></H2>");
           client.println("<br />");  
           client.println("<a href=\"/?button1on\"\">Switch 1 ON</a>");
           client.println("<a href=\"/?button1off\"\">Switch 1 OFF</a><br />");   
           client.println("<br />");     
           client.println("<br />"); 
           client.println("<a href=\"/?button2on\"\"></a>");
           client.println("<a href=\"/?button2off\"\">Rotate Right</a><br />"); 
           client.println("<p>Created by Alex Li!</p>");  
           client.println("<br />"); 
           client.println("</BODY>");
           client.println("</HTML>");
     
           delay(1);
     
           client.stop();
           //controls the Arduino if you press the buttons
           if (readString.indexOf("?button1on") >0){
               digitalWrite(led, HIGH);
           }
           if (readString.indexOf("?button1off") >0){
               digitalWrite(led, LOW);
           }
            //clears the string
            readString="";  
           
         }
       }
    }
}
else{
    //Serial.println("Something is wrong");
  }
}
