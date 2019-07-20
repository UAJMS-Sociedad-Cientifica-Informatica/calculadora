import java.util.ArrayList;
import java.util.Scanner;

public class entrada {

public ArrayList separar(String cad) {
	ArrayList l=new ArrayList();
	String cad1="+-*/";
	String c="";
	String aux="";
	c=c+cad.charAt(0);
	if(cad1.contains(c)) {
	aux=aux+cad.charAt(0);
	for(int i=1; i<cad.length();i++) {
		c="";
		c=c+cad.charAt(i);
		if(cad1.contains(c)) {l.add(aux);
		l.add(c);
		aux="";}
		else {if(i==cad.length()-1) {aux=aux+c;l.add(aux);}
		else{aux=aux+c;}}
		}
	}
	else {for(int i=0; i<cad.length();i++) {
		c="";
		c=c+cad.charAt(i);
		if(cad1.contains(c)) {l.add(aux);
		l.add(c);
		aux="";}
		else {if(i==cad.length()-1) {aux=aux+c;l.add(aux);}
		else{aux=aux+c;}}
	}}
	return l;
	
}
}
