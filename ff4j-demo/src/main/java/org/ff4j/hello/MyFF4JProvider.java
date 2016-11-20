package org.ff4j.hello;
 
import org.ff4j.FF4j;
import org.ff4j.web.api.FF4JProvider;
 
public class MyFF4JProvider implements FF4JProvider {
 
    private final FF4j ff4j;
   
    public MyFF4JProvider() {
        ff4j = new FF4j("ff4j.xml");
    }
  
    /** {@inheritDoc} */
    public FF4j getFF4j() { return ff4j; }
}