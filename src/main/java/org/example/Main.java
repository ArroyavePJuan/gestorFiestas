package org.example;

public class Main {
    public static void main(String[] args) {

        //EN EL MAIN LLAMO A MIS CLASES
        //EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
        //EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        //EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS

        Invitado objetoDeLaClaseInvitado = new Invitado();
        Invitado objeto2 = new Invitado(24,true,"Juan Jose",80000);


        //obtener el valor de los atributo
        System.out.println(objetoDeLaClaseInvitado.nombre);
        System.out.println(objeto2.nombre);

    }
}