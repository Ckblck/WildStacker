package com.bgsoftware.wildstacker.nms.v1_18_R1.mappings.net.minecraft.world.phys;

import com.bgsoftware.wildstacker.nms.mapping.Remap;
import com.bgsoftware.wildstacker.nms.v1_18_R1.mappings.MappedObject;

public class AxisAlignedBB extends MappedObject<net.minecraft.world.phys.AxisAlignedBB> {

    public AxisAlignedBB(net.minecraft.world.phys.AxisAlignedBB handle) {
        super(handle);
    }

    @Remap(classPath = "net.minecraft.world.phys.AABB",
            name = "inflate",
            type = Remap.Type.METHOD,
            remappedName = "c")
    public net.minecraft.world.phys.AxisAlignedBB inflate(double modX, double modY, double modZ) {
        return handle.c(modX, modY, modZ);
    }

}