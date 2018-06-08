/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josephmoscoso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joseph
 */
public class textos {

    private ArrayList<Usuarios> listaPersonas = new ArrayList();
    private File archivo = null;

    public textos() {
    }
    
    public textos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuarios> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra 
    public void setPersona(Usuarios p) {
        this.listaPersonas.add(p);
    }

    //metodos administrador
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            // archivo = new File("./salida.txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaPersonas) {
                bw.write(t.toString() + ";");
                //bw.write(t.getNombre() + ";");
                /*for (Hobbie h : t.getHobbies()) {
                    bw.write(h.getId() + ",");
                    bw.write(h.getDescripcion() + ",");
                }*/
//                bw.write(";");
//                bw.write(t.getEdad() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    /*public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int c, e;
                    String n;
                    ArrayList<Hobbie> temp = new ArrayList();
                    c = sc.nextInt();
                    n = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp.add(new Hobbie(s2.nextInt(), s2.next()));
                    }
                    e = sc.nextInt();
                    listaPersonas.add(new persona(c, n, e));
                    listaPersonas.get(listaPersonas.size() - 1).setHobbies(temp);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }*/
}
