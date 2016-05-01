package Yandere;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

/**
 * Created by frostbyte on 4/28/16.
 */
public class BakaMod extends DummyModContainer {
    public BakaMod instance;
    public BakaMod(){
        super(new ModMetadata());
        ModMetadata MoeMeta = getMetadata();
        MoeMeta.name = "meta";
        MoeMeta.version = "meme";
        MoeMeta.modId = "Spoofed";
        this.Inittheshit();
    }
    public void Inittheshit(){
        instance = this;
        if(PervDetector.DetectPervs("test")){
            System.out.println("Exists");
        }
    }
}
