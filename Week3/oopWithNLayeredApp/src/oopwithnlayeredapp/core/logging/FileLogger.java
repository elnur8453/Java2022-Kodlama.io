/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopwithnlayeredapp.core.logging;

/**
 *
 * @author ASUS
 */
public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi:" + data);
    }
    
}
