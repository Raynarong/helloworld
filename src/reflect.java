import java.lang.reflect.Method;


public class reflect {
public static void main(String args[]) throws Exception{
	Class ownerClass = Class.forName("Test");
    Object owner=ownerClass.newInstance();
    
    	Method[] methods=ownerClass.getDeclaredMethods();
    	Object result;
    	for(Method method: methods){
    		if(method.getName()=="apply"){
    		  method.invoke(owner);    		
    		}
    	}    
}
}
