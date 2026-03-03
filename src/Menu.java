import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void desplegar() throws IOException {

        int opc = 0;
        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        ArrayList<Dispositivo> listaDispositivo = new ArrayList<Dispositivo>();
        boolean mascotaEncontrada;
        boolean mascotaExistente;
        boolean dispositivoEncontrada;

        while (opc != 5) {

            System.out.println("--- MENU ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Asociar dispositivo con mascota");
            System.out.println("3. Registro manual ubicación");
            System.out.println("4. Consultar información");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            opc = Integer.parseInt(reader.readLine());

            switch (opc) {

                case 1:
                    System.out.println("--- REGISTRO DE MASCOTA ---");
                    System.out.println("Ingrese el código de indentificación de la mascota: ");
                    int codigoMascota = Integer.parseInt(reader.readLine());

                    mascotaExistente = false;
                    for (int i = 0; i < listaMascotas.size(); i++) {
                        Mascota temp = listaMascotas.get(i);
                        if (temp.getCodigoMascota() == codigoMascota) {
                            mascotaExistente = true;
                            System.out.println("Una mascota con el código " + codigoMascota + " ya está registrada en el sistema.");
                            break;
                        }
                    }
                    if (!mascotaExistente) {
                        System.out.println("Ingrese el nombre de la mascota: ");
                        String nombreMascota = reader.readLine().toLowerCase();
                        System.out.println("Ingrese la especie de la mascota: ");
                        String especieMascota = reader.readLine();
                        System.out.println("Ingrese el estado de la mascota: ");
                        String estadoMascota = reader.readLine();
                        Mascota mascotaInsertar = new Mascota(codigoMascota, nombreMascota, especieMascota, estadoMascota);
                        listaMascotas.add(mascotaInsertar);
                        System.out.println("Mascota registrada correctamente.");
                    }
                    break;

                case 2:
                    if (listaMascotas.isEmpty()) {
                        System.out.println("Lo sentimos, no hay mascotas registradas en el sistema.");
                        break;
                    } else {
                        System.out.println("--- ASOCIACIÓN DE DISPOSITIVO ---");
                        System.out.println("Ingrese el código del dispositivo: ");
                        int codigoDispositivo = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el estado del dispositivo: ");
                        String estadoDispositivo = reader.readLine();
                        Dispositivo dispositivoInsertar = new Dispositivo(codigoDispositivo, estadoDispositivo);
                        System.out.println("Ingrese el código de la mascota a asociar con el dispositivo: ");
                        int mascotaBuscar = Integer.parseInt(reader.readLine());
                        mascotaEncontrada = false;
                        for (int i = 0; i < listaMascotas.size(); i++) {
                            Mascota temp = listaMascotas.get(i);

                            if (temp.getCodigoMascota() == mascotaBuscar) {
                                mascotaEncontrada = true;

                                // Verificar si la mascota ya tiene un dispositivo asociado
                                if (temp.getDispositivo() != null) {
                                    System.out.println("Esta mascota ya tiene un dispositivo asociado.");
                                    break;
                                } else {
                                    temp.setDispositivo(dispositivoInsertar);
                                    listaDispositivo.add(dispositivoInsertar);
                                    System.out.println("Dispositivo asociado correctamente.");
                                }
                                break;
                            }
                        }

                        if (!mascotaEncontrada) {
                            System.out.println("Mascota con el código " + mascotaBuscar  + " no encontrada en el sistema.");
                        }
                    }
                    break;

                case 3:
                    if (listaDispositivo.isEmpty()) {
                        System.out.println("Lo sentimos, no hay dispositivos registrados en el sistema.");
                    } else {
                        System.out.println("--- REGISTRO MANUAL UBICACIÓN ---");
                        System.out.println("Ingrese el identificador de la ubicación: ");
                        int identificadorUbicacion = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese la fecha/hora de la ubicación: Formato(01/01/01-00:00) ");
                        String fechaHoraUbicacion = reader.readLine();
                        System.out.println("Ingrese el nombre de la ubicación: ");
                        String ubicacion = reader.readLine().toLowerCase();
                        RegistroUbicacion ubicacionInsertar = new RegistroUbicacion(identificadorUbicacion, fechaHoraUbicacion, ubicacion);

                        System.out.println("Ingrese el código del dispositivo a asociar: ");
                        int dispositivoBuscar = Integer.parseInt(reader.readLine());
                        dispositivoEncontrada = false;
                        for (int i = 0; i < listaDispositivo.size(); i++) {
                            Dispositivo temp = listaDispositivo.get(i);
                            if (dispositivoBuscar == temp.getCodigoDispositivo()) {
                                dispositivoEncontrada = true;

                                // Verificar si el dispositivo ya tiene una ubicación asociada
                                if (temp.getUbicacion() != null) {
                                    System.out.println("Este dispositivo ya tiene una ubicación asociada.");
                                    break;
                                } else {
                                    temp.setUbicacion(ubicacionInsertar);
                                    System.out.println("Ubicación asociada correctamente.");
                                }
                                break;
                            }
                        }

                        if (!dispositivoEncontrada) {
                            System.out.println("Dispositivo no encontrado en el sistema.");
                        }
                    }
                    break;

                case 4:
                    if (listaMascotas.isEmpty()) {
                        System.out.println("Lo sentimos, no hay mascotas registradas en el sistema.");
                        break;
                    } else {
                        System.out.println("--- BUSCAR MASCOTA ---");
                        System.out.println("Ingrese el código de la mascota a consultar: ");
                        int mascotaBuscarConsulta = Integer.parseInt(reader.readLine());
                        mascotaEncontrada = false;
                        for (int i = 0; i < listaMascotas.size(); i++) {
                            Mascota temp = listaMascotas.get(i);
                            if (temp.getCodigoMascota() == mascotaBuscarConsulta) {
                                mascotaEncontrada = true;
                                System.out.println(temp);
                            }
                        }
                        if (!mascotaEncontrada) {
                            System.out.println("Mascota con el código " + mascotaBuscarConsulta  + " no encontrada en el sistema.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}