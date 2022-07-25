package org.eclipse.jdt.core.dom;
import java.util.*;


class channel
{
        String channelname;
        LinkedList<subscribe> allsubslist = new LinkedList<subscribe>();
        
        public void register1(subscribe x)
        {
        	allsubslist.add(x);
        	
        }
        
        public void notify1()
        {
            for(int i=0;i<allsubslist.size();i++)
            {   
                allsubslist.get(i).update();
            }
            
        }
}
public class mainclass
{
	public static void main(String[] args) {
	channel x= new channel();
	x.channelname="javabrains";
	subscribe s1= new subscribe();
	s1.name="1";
	x.register1(s1);
	subscribe s2= new subscribe();
	s2.name="2";
	x.register1(s2);
	subscribe s3= new subscribe();
	s3.name="3";
	x.register1(s3);
	x.notify1();
	
	}
}
class subscribe
{
        String name;
        channel Channelname;
        
        void update()
        {
            System.out.println("observe design pattern");
        }
}
