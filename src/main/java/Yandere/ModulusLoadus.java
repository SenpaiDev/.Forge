package Yandere;

import net.minecraftforge.classloading.FMLForgePlugin;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

/**
 * Created by frostbyte on 4/28/16.
 */
public class ModulusLoadus implements IFMLLoadingPlugin{

    @Override
    public String[] getASMTransformerClass() {
/*
            if(PervDetector.DetectPervs("test")){
                System.out.println("Path found");
            }
*/
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return "Yandere.BakaMod";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
