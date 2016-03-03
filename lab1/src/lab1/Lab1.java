package lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        int opcion, opcion2, c = 0;
        String nombreClase, apellidoClase, cedulaClase;
        String fechanacimientoClase, direccionClase, telefonoClase, areasClase;
        Scanner lector = new Scanner(System.in);

        Contactos[] nit = new Contactos[10];

        do {
            System.out.println("Digite una opción: ");
            System.out.println("1. ingresar usuario");
            System.out.println("2. actualizar usuario");
            System.out.println("3. eliminar usuario");
            System.out.println("4. buscar usuario");
            System.out.println("5. imprimir base de datos");
            System.out.println("6. salir");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1:
                    c++;
                    nit[c] = new Contactos();
                    System.out.println("ingrese el nombre:");
                    nombreClase = lector.next();
                    nit[c].setNombre(nombreClase);

                    System.out.println("ingrese el apellido:");
                    apellidoClase = lector.next();
                    nit[c].setApellido(apellidoClase);

                    System.out.println("ingrese el numero de cedula:");
                    cedulaClase = lector.next();
                    nit[c].setCedula(cedulaClase);

                    System.out.println("ingrese la fecha de nacimiento:");
                    fechanacimientoClase = lector.next();
                    nit[c].setFechanacimiento(fechanacimientoClase);

                    System.out.println("ingrese la direccion:");
                    direccionClase = lector.next();
                    nit[c].setDireccion(direccionClase);

                    System.out.println("ingrese el numero de telefono:");
                    telefonoClase = lector.next();
                    nit[c].setTelefono(telefonoClase);

                    System.out.println("Ingrese el área de interés:"
                            + "\n1. Química"
                            + "\n2. Física"
                            + "\n3. Tecnología"
                            + "\n4. Cálculo"
                            + "\n5. programacion");
                    opcion2 = lector.nextInt();

                    switch (opcion2) {

                        case 1:
                            nit[c].setAreas("Quimica");

                            break;

                        case 2: {
                            nit[c].setAreas("Fisica");
                        }
                        break;

                        case 3: {
                            nit[c].setAreas("Tecnologia");
                        }
                        break;

                        case 4: {
                            nit[c].setAreas("Calculo");
                        }
                        break;

                        case 5: {
                            nit[c].setAreas("Programcaion");
                        }
                        break;
                    }

                    break;

                case 2:

                    int i = 0,
                     estado = 0;
                    String buscar = new String();
                    System.out.println("ingrese el nombre del usuario para actualizar datos:");
                    buscar = lector.next();
                    if (c > 0) {
                        nit[i] = new Contactos();
                        for (i = 0; i < c + 1; i++) {

                            if (buscar.equals(nit[i].getNombre())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[i].getNombre());
                                System.out.println("apellido:" + nit[i].getApellido());
                                System.out.println("cedula: " + nit[i].getCedula());
                                System.out.println("fecha de nacimiento: " + nit[i].getFechanacimiento());
                                System.out.println("direccion: " + nit[i].getDireccion());
                                System.out.println("telefono: " + nit[i].getTelefono());
                                System.out.println("areas: " + nit[i].getAreas());

                                System.out.println("ingrese el nuevo nombre:");
                                nombreClase = lector.next();
                                nit[i].setNombre(nombreClase);

                                System.out.println("ingrese el nuevo apellido:");
                                apellidoClase = lector.next();
                                nit[i].setApellido(apellidoClase);

                                System.out.println("ingrese el nuevo numero de cedula:");
                                cedulaClase = lector.next();
                                nit[i].setCedula(cedulaClase);

                                System.out.println("ingrese la nueva fecha de nacimiento:");
                                fechanacimientoClase = lector.next();
                                nit[i].setFechanacimiento(fechanacimientoClase);

                                System.out.println("ingrese la nueva direccion:");
                                direccionClase = lector.next();
                                nit[i].setDireccion(direccionClase);

                                System.out.println("ingrese el nuevo numero de telefono:");
                                telefonoClase = lector.next();
                                nit[i].setTelefono(telefonoClase);

                                System.out.println("ingrese la nueva area fovorita:");
                                areasClase = lector.next();
                                nit[i].setAreas(areasClase);

                                estado = 1;
                                break;

                            }
                        }
                    }

                    if (estado == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;
                    
                case 3:

                    int m = 0,
                     estado2 = 0;
                    String eliminar = new String();
                    System.out.println("ingrese el nombre del usuario para eliminar:");
                    eliminar = lector.next();
                    if (c > 0) {
                        nit[m] = new Contactos();
                        for (m = 0; m < c + 1; m++) {

                            if (eliminar.equals(nit[m].getNombre())) {

                                for (int r = m; r < c; r++) {

                                    nit[r] = nit[r + 1];
                                }
                                c--;
                            }

                        }
                    }
                    if (estado2 == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;

                case 4:

                    int j = 0,
                     esta = 0;
                    String buscaUsuario;
                    System.out.println("ingrese el nombre del usuario para buscar datos:");
                    buscaUsuario = lector.next();
                    if (c > 0) {
                        nit[j] = new Contactos();
                        for (j = 0; j <= c; j++) {
                            if (buscaUsuario.equals(nit[j].getNombre())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[j].getNombre());
                                System.out.println("apellido: " + nit[j].getApellido());
                                System.out.println("cedula: " + nit[j].getCedula());
                                System.out.println("fecha de nacimiento: " + nit[j].getFechanacimiento());
                                System.out.println("direccion: " + nit[j].getDireccion());
                                System.out.println("telefono: " + nit[j].getTelefono());
                                System.out.println("areas: " + nit[j].getAreas());
                                esta = 1;
                                break;
                            }
                        }
                    }

                    break;

                case 5:

                    int p = 0;
                    nit[p] = new Contactos();
                    if (c > 0) {
                        for (p = 0; p <= c; p++) {
                            System.out.println("datos:");
                            System.out.println("nit: " + p);
                            System.out.println("nombre: " + nit[p].getNombre());
                            System.out.println("apellido: " + nit[p].getApellido());
                            System.out.println("cedula: " + nit[p].getCedula());
                            System.out.println("fecha de nacimiento: " + nit[p].getFechanacimiento());
                            System.out.println("direccion: " + nit[p].getDireccion());
                            System.out.println("telefono: " + nit[p].getTelefono());
                            System.out.println("areas: " + nit[p].getAreas());
                        }
                    }
                    break;
            }
        } while (opcion != 6);
    }
}
