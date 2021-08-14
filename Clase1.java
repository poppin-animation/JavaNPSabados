import java.text.DecimalFormat;

public class Clase1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//comentario de una linea 
		
		/*
		 * bloque de comentario para explicar cosas
		 * 
		 */
		
		System.out.println("Hola Mundo!");
		System.out.println("Jell-O World!");
		
		//Syso - control - enter: atajo para System.our.println(); en eclipse
		//sout - TAB: atajo para System.out.println(); en netbeans
		System.out.println("Hoy es Sabado!");
		System.out.print("1, ");
		System.out.println("2");
		//java es un lenguaje de tipado fuerte
		//variables =  lugares de memoria para guaradar un dato 
		//tipos de datos = numericos, textos, etcs
		
		//entero 
		int a;             //declaro la variable a del tipo numero entero
		a = 2;             // asigno valor a la variable a
		System.out.println(a);
		
		int b = 4;         // declaro y asigno valor a la variable b del tipo entero
		System.out.println(b);
		
		int c = a+b;
		System.out.println(c);
		
		int d = 4, e=27, f=29, g=39;    //declaración y asignación múltiple de variables. 
		//// las variables solo se pueden declarar una vez, pero pueden tener multilpes asignaciones;
		
		
		
		
		//Tipo de sString= Cadena de caracteres 
		String r="Recreo";
		String j= "Cafe";
		
		System.out.println(r+" y "+j);
		
		///tipo de datos CHAR --> almacena en 2 bits de memoria.. tabla ASCII
		char z;
		//guardo un numero pero cuando imprimo, me muestra su equivalencia en la tabla ASCCII
		char car= 65;
		System.out.println(car);
		car= 'c'; //De esta manera SI me guarda la C pero usa el valor de la tabla ASCII 92 para guardarlo. 
		System.out.println(car);
		
		//Tipo de dato FLOAT 32 bits
		float fl = 9.56f;   //un nro float tiene que tener una f alfinal si no da error !!!!!
		System.out.println(fl);
		
		//tipo de dato DOUBLE a 64bits
		double dl = 9.56; /// no necesita la D para que funcione
		System.out.println(dl);
		
		fl = 100;
		dl=100;
		
		System.out.println(fl/3);  // 33.333332
		System.out.println(dl/3);  // 33.333333333333336
		//tienen diferencias en la presición decimal . 
		
		//separador de miles --> lo tengo que importar, y me sirve para expresar las expresiones monetarias con decimales con coma y separador de miles con peso 
		DecimalFormat df=new DecimalFormat("###,###,###.00");  //Se pone en ingles, pero revisa la configuracion de la maquina para traducirlos separadores de miles y decimales de coma a punto. 
		double precio = 3000000.50;
		System.out.println(df.format(precio));
		
		
		
		//tipo de datos booleano 
		boolean bo=true;
		System.out.println(bo);
		bo=false;
		System.out.println(bo);
		
		
		//operador de asignacion =
		int nro1=5;
		int nro2=7;
		System.out.println(nro1+" "+nro2);
		
		nro1=nro2;
		System.out.println(nro1+" "+nro2);
		
		
		
		//operadores incrementales
		//sumar 1 a la variable ++
		nro1++; //nro1=nro1+1;
		System.out.println(nro1);
		
		
		//Restar 1 a al variable --
		nro1--;   //nro1=nro1-1;
		System.out.println(nro1);
		
		//sumar x a la variable += 
		nro1+=5;  //nro1=nro1+5;
		System.out.println(nro1);
		
		//restar x a la variable -= 
		nro1-=5;  //nro1=nro1-5;
		System.out.println(nro1);
		
		//multiplicar *=
		nro1*=5;  //nro1=nro1*5;
		System.out.println(nro1);
		
		//dividir /=
		nro1/=5;  //nro1=nro1/5;
		System.out.println(nro1);
		
		
		///constantes
		//las constantes pertenecen a un tipo de dato y solo pueden tener una asignacion de valor;
		
		final double PI=3.14; //final -> constante
		//por convencion las variables van en minuscula y las constantes en mayusculas
		//PI++; me marca un error , porque no se puede cambiar la asignacion. 
		
		
		//operadores LOGICOS
		
		/*
		 * operador			nombre
		 * ==				COMPARACION (EQUALS)
		 * <  <=  >  >=     RELACIONALES
		 * !=				NO IGUALES (NOT EQUALS)
		 * !				NO (NOT)
		 * &&				AND (SHIFT + 6)
		 * ||				OR (ALTGR + 1)
		 *  
		 * 
		 */
		
		
		
		int n1=7;
		int n2=10;
		boolean log1 = true;
		boolean log2 = false;
		
		System.out.println(n1==7);     //TRUE
		System.out.println(n1==n2);    //FALSE
		System.out.println(n1==n1+1);  //FALSE
		System.out.println(n1!=7);     //FALSE
		System.out.println(n1!=n2);    //TRUE
		System.out.println(n1<10);     //TRUE
		System.out.println(n1<=7);     //TRUE
		System.out.println(n1<7);      //FALSE
		
		
		System.out.println(log1);     //TRUE
		System.out.println(!log1);     //FALSE
		System.out.println(!!log1);     //TRUE
		System.out.println(!!!log1);     //FALSE
		System.out.println(!!!!log1);     //TRUE
		//el multiple negado invierte el resultado 
		//cuando la cantidad de negados es PAR, afirmo.
		//cuando la cantidad de negados es IMPAR, estoy negando
		
		
		
		//TABLAS DE VERDAD
		/*__________________________________________________
		 *	 X 			Y 				OR				AND
		 *____________________________________________________
		 *	 F 			F 				F				F 
		 *	 F 			V 				V				F 
		 *	 V 			F 				V				F 
		 *	 V 			V 				V				V 
		 *	
		 *_____________________________________________________
		 *   X 			Y 		Z		OR				AND
		 *____________________________________________________
		 *	 F 			F 				F				F 
		 *	 F 			V 				V				F 
		 *	 V 			F 				V				F 
		 *	 V 			V 				V				V 		 * 
		 * 
		 */
		
		System.out.println(log1 || log2); //TRUE
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
