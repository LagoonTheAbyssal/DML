package wolfshotz.dml.entity.dragons;

import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import wolfshotz.dml.entity.dragonegg.DragonEggEntity;

public class WaterDragonEntity extends TameableDragonEntity
{
    public WaterDragonEntity(EntityType<? extends TameableDragonEntity> type, World world)
    {
        super(type, world);
    }

    public static boolean isHabitat(DragonEggEntity egg)
    {
        return egg.world.getBlockState(egg.getPosition()).getBlock() == Blocks.WATER;
    }

    @Override
    public CreatureAttribute getCreatureAttribute() { return CreatureAttribute.WATER; }

    @Override
    public boolean canBreatheUnderwater() { return true; }

    // todo: water dragons aren't affected by water?
//    @Override
//    public boolean handleFluidAcceleration(Tag<Fluid> fluid)
//    {
//        return fluid == FluidTags.WATER;
//    }
}
