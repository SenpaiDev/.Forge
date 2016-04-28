package Yandere;

import net.minecraft.client.Minecraft;

import java.io.File;

/**
 * Created by frostbyte on 4/28/16.
 */
public class PervDetector {
    public static Boolean DetectPervs(String Perv){
        File f = new File(Minecraft.getMinecraft().mcDataDir + "/mods/"+Perv);
        if(f.exists() && !f.isDirectory()){
            return true;
        } else
        return false;
    }
}
