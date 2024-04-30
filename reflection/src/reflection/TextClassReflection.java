package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;

public class TextClassReflection {
	String name="";
	public static void main(String[] args) throws ClassNotFoundException {
		String className=new String("java.lang.String");
		
//		if (args.length<0) {
//			className =args[0];
//			
//		}
		
		Class<?> objectClass=Class.forName(className);
		Method[] methods=objectClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			//Method method = methods[i];
			String name=methods[i].getName();
			Parameter[] classParameters=methods[i].getParameters();
			String stringClassParameters=" ";
			int length=classParameters.length;
			for (int j = 0; j < length; j++) {
				stringClassParameters+=classParameters[j].getClass().getName() + " " + classParameters[j].getName();
				
				if (j != (length-1)) {
					stringClassParameters +=", ";
				}
				
			}
			String methodReturnType=methods[i].getReturnType().getName();
			String methodString=methodReturnType+" "+name+" ("+stringClassParameters+" )";
			System.out.println(methodString);
		}
	}

}
