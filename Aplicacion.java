package estructura;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		Object opc = JOptionPane.showInputDialog(null,"Seleccione un parametro",
				   "PARÁMETROS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Materia", "Alumno", "Profesor" },"Seleccione");

		Materia materia= new Materia();
		String opcion= (String) opc;
		if(opcion.equals("Materia")){
			
				materia= llenarMateriasDisc();
				JOptionPane.showMessageDialog(null, materia);		
		}if(opcion.equals("Alumno")){
			
			materia= llenarAlumnoPorBusq();
			JOptionPane.showMessageDialog(null, materia);		
	}
		
		
		
		

	}

		public static Profesor[] llenarProfesorIndic(String p){
				
			Profesor profesores2[]= new Profesor[4];
			if(p.equals("Sistemas de comunicacion")){
			Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(11);
			profesores[0].setNombre("Alexandra");
			profesores2=profesores;
			}
			else if(p.equals("Ecologia")){
				Profesor profesores[]= new Profesor[2];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("Graciela");
			
			profesores[1]= new Profesor();
			profesores[1].setId(13);
			profesores[1].setNombre("Elisa Mena");
			profesores2=profesores;
			}
			else if (p.equals("Fisica")){
				Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("Galo Nuñez");
			profesores2=profesores;
			}
			
			return profesores2;
			
		}
		
		public static Alumno[] llenarAlumno(String a){
			
			Alumno alumnos[]= new Alumno[4];
			alumnos[0]= new Alumno();
			alumnos[0].setId(1);
			alumnos[0].setNombre("Valeria");
			
			alumnos[1]= new Alumno();
			alumnos[1].setId(2);
			alumnos[1].setNombre("Alexander");
			
			alumnos[2]= new Alumno();
			alumnos[2].setId(3);
			alumnos[2].setNombre("Estefani");
			
			alumnos[3]= new Alumno();
			alumnos[3].setId(4);
			alumnos[3].setNombre("Andres");
			
			
			if(a.equals("Sistemas de comunicacion")){
				Alumno aux[]= new Alumno[2];
				aux[0]=alumnos[0];
				aux[1]=alumnos[1];
				return aux;
			}
			
			else if(a.equals("Ecologia")){
				Alumno aux[]= new Alumno[3];
				aux[0]=alumnos[0];
				aux[1]=alumnos[1];
				aux[2]=alumnos[2];
				return aux;
			}
			else{
			
			return alumnos;
			}
			
		}
		
		public static Materia llenarMateriasDisc(){
			
			Materia materia = new Materia();
			Object opc = JOptionPane.showInputDialog(null,"Seleccione una materia",
					   "MATERIA", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione","Ecologia", "Sistemas de comunicacion", "Fisica" },"Seleccione");
			String nombre= (String) opc;
			materia.setNombremateria(nombre);
			materia.setProfesor(llenarProfesorIndic(materia.getNombremateria()));
			materia.setCod(31);
			materia.setAsistentes(llenarAlumno(materia.getNombremateria()));
			
			
			return materia;
		}
		

		public static Profesor[] llenarProfesorTotal(String m){
			
			
			
			Profesor profesores[]= new Profesor[4];
			profesores[0]= new Profesor();
			profesores[0].setId(11);
			profesores[0].setNombre("Alexandra");
			
			profesores[1]= new Profesor();
			profesores[1].setId(12);
			profesores[1].setNombre("Graciela");
			
			profesores[2]= new Profesor();
			profesores[2].setId(13);
			profesores[2].setNombre("Elisa Mena");
			
			profesores[3]= new Profesor();
			profesores[3].setId(12);
			profesores[3].setNombre("Galo Nuñez");
			
			return profesores;
			
		}
	public static Materia llenarAlumnoPorBusq(){
			
			Materia alumno = new Materia();
			Object opc = JOptionPane.showInputDialog(null,"Seleccione una alumno","ALUMNO", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione","Valeria", "Alexander", "Estefani","Andres" },"Seleccione");
			String nombre= (String) opc;
			String n="";
			alumno.setCod(21);
			alumno.setNombremateria(nombre);
			
		alumno.setAsistentes(llenarAlumno(alumno.getNombremateria()));
			
			if(n.equals("Valeria"))
				JOptionPane.showMessageDialog(null, llenarAlumno(n));	
			return alumno;
		}
		
}
