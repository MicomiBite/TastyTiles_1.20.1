package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.micomibite.tastytiles.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TastyTiles.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.PITTER_TILES)
                .add(ModBlocks.BRICK_PITTER_TILE.get(),
                        ModBlocks.BRICK_PITTER_TILE_SLAB.get(),
                        ModBlocks.BRICK_PITTER_TILE_STAIRS.get(),
                        ModBlocks.BRICK_PITTER_TILE_WALL.get(),
                        ModBlocks.FIRE_PITTER_TILE.get(),
                        ModBlocks.FIRE_PITTER_TILE_SLAB.get(),
                        ModBlocks.FIRE_PITTER_TILE_STAIRS.get(),
                        ModBlocks.FIRE_PITTER_TILE_WALL.get(),
                        ModBlocks.OCHRE_PITTER_TILE.get(),
                        ModBlocks.OCHRE_PITTER_TILE_SLAB.get(),
                        ModBlocks.OCHRE_PITTER_TILE_STAIRS.get(),
                        ModBlocks.OCHRE_PITTER_TILE_WALL.get(),
                        ModBlocks.EARTHY_PITTER_TILE.get(),
                        ModBlocks.EARTHY_PITTER_TILE_SLAB.get(),
                        ModBlocks.EARTHY_PITTER_TILE_STAIRS.get(),
                        ModBlocks.EARTHY_PITTER_TILE_WALL.get(),
                        ModBlocks.PALE_PITTER_TILE.get(),
                        ModBlocks.PALE_PITTER_TILE_SLAB.get(),
                        ModBlocks.PALE_PITTER_TILE_STAIRS.get(),
                        ModBlocks.PALE_PITTER_TILE_WALL.get(),
                        ModBlocks.LUSH_PITTER_TILE.get(),
                        ModBlocks.LUSH_PITTER_TILE_SLAB.get(),
                        ModBlocks.LUSH_PITTER_TILE_STAIRS.get(),
                        ModBlocks.LUSH_PITTER_TILE_WALL.get(),
                        ModBlocks.DEEP_PITTER_TILE.get(),
                        ModBlocks.DEEP_PITTER_TILE_SLAB.get(),
                        ModBlocks.DEEP_PITTER_TILE_STAIRS.get(),
                        ModBlocks.DEEP_PITTER_TILE_WALL.get(),
                        ModBlocks.PITCH_PITTER_TILE.get(),
                        ModBlocks.PITCH_PITTER_TILE_SLAB.get(),
                        ModBlocks.PITCH_PITTER_TILE_STAIRS.get(),
                        ModBlocks.PITCH_PITTER_TILE_WALL.get(),
                        ModBlocks.PINK_PITTER_TILE.get(),
                        ModBlocks.PINK_PITTER_TILE_SLAB.get(),
                        ModBlocks.PINK_PITTER_TILE_STAIRS.get(),
                        ModBlocks.PINK_PITTER_TILE_WALL.get());

    }
}
