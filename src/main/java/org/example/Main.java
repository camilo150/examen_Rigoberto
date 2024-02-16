package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String usuarioBD = "pepe",
                contrasenaBD = "123",
                gmailBD="hola@gmail.com",
                gmail,
                usuario,
                contrasena,
                respuestaPropina;

        int intentos = 0,
                opcion=0,
                plato=0,
                cantidadPlatos=0,
                precio;

        double total=0.0;

        Scanner leerDato=new Scanner(System.in);


        //inicio de secion melo

        System.out.println("bienvenido a restaurante rigoberto por favor digite su usuario y contraseña para poder acceder");
        do {
            System.out.print("Usuario: ");
            usuario=leerDato.nextLine();
            System.out.print("Contraseña: ");
            contrasena=leerDato.nextLine();
            System.out.print("Gmail: ");
            gmail=leerDato.nextLine();

            if (contrasena.equals(contrasenaBD) && usuario.equals(usuarioBD) && gmail.equals(gmailBD)) {
                System.out.println("¡Inicio de sesión exitoso!");
                break;
            } else {
                intentos++;
                if (intentos >= 3) {
                    System.out.println("Demasiados intentos. Cerrando el programa.");
                }
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
            }
        } while (true);

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Ingresar orden");
            System.out.println("2. Modificar orden");
            System.out.println("3. Terminar orden y calcular total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leerDato.nextInt();
            leerDato.nextLine();


            //menu de elecciones melo

            if (opcion == 1) {
                do {
                    System.out.println("Listado de platos:");
                    System.out.println("1. Entrada de cangrejo de Urrao ($28,000)");
                    System.out.println("2. Escalopes a la Rigo ($35,000)");
                    System.out.println("3. Filete Tour de Francia ($150,000)");
                    System.out.println("4. Corvina de Rigo ($80,000)");
                    System.out.println("5. Coctel Michelle ($20,000)");
                    System.out.println("6. Jugos de Urrao ($18,500)");
                    System.out.println("7. no deseo nada");
                    plato = leerDato.nextInt();

                     if (plato == 1) {
                        precio=28000;
                        total=total+precio;

                    } else if (plato == 2) {

                        precio=35000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 3) {

                        precio=150000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 4) {
                        precio= 80000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 5) {

                        precio=cantidadPlatos *  20000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 6) {
                        precio= 18500;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else {
                        System.out.println("Plato no válido: " + plato);
                    }
                }while (plato!=7);
                System.out.println("su compra total hasta ahora es de"+total);

            } else if (opcion == 2) {

                System.out.println("que articulo de su compra decea modificar?");
                do {
                    System.out.println("Listado de platos:");
                    System.out.println("1. Entrada de cangrejo de Urrao ($28,000)");
                    System.out.println("2. Escalopes a la Rigo ($35,000)");
                    System.out.println("3. Filete Tour de Francia ($150,000)");
                    System.out.println("4. Corvina de Rigo ($80,000)");
                    System.out.println("5. Coctel Michelle ($20,000)");
                    System.out.println("6. Jugos de Urrao ($18,500)");
                    System.out.println("7. no deseo nada");
                    plato = leerDato.nextInt();

                    if (plato == 1) {
                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos * 28000;
                        total=total+precio;
                    } else if (plato == 2) {

                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos * 35000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 3) {
                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos * 150000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 4) {
                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos *  80000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 5) {
                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos *  20000;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);

                    } else if (plato == 6) {
                        System.out.println("Digite la cantidad de platos que desea: ");
                        cantidadPlatos = leerDato.nextInt();
                        precio=cantidadPlatos * 18500;
                        total=total+precio;
                        System.out.println("el total de su compra hasta ahora es de"+total);
                    } else {

                        System.out.println("Plato no válido: " + plato);
                    }

                }while (plato!=7);
                System.out.println("su compra total hasta ahora es de"+total);

            } else if (opcion == 3) {

                System.out.println("el costo total de la compra es de"+total);

                System.out.print("¿Desea agregar propina? (S/N): ");
                respuestaPropina = leerDato.nextLine();

                if (respuestaPropina.equalsIgnoreCase("S")) {

                    System.out.print("Seleccione el porcentaje de propina (5% o 10%): ");
                    int porcentajePropina = leerDato.nextInt();
                    double propina = (total * porcentajePropina) / 100.0;
                    total += propina;
                    System.out.println("Total con propina del " + porcentajePropina + "%: $" + total);

                } else {
                    System.out.println("Total sin propina: $" + total);
                }

            } else if (opcion == 4) {
                System.out.println("Gracias por su tiempo, Saliendo del programa...");

            } else if (opcion < 1 || opcion > 4) {

                System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
            }

        }while (opcion!= 4);
    }
}