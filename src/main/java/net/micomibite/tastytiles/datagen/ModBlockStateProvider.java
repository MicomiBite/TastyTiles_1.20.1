package net.micomibite.tastytiles.datagen;

import com.mojang.serialization.MapCodec;
import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

import static net.minecraft.world.level.levelgen.structure.Structure.simpleCodec;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TastyTiles.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.BRICK_PITTER_TILE);
        //slabBlock(((SlabBlock) ModBlocks.BRICK_PITTER_TILE_SLAB.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.BRICK_PITTER_TILE.get(), buildSimpleBlockWithRenderType("brick_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.BRICK_PITTER_TILE_SLAB.get(), ModBlocks.BRICK_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.BRICK_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BRICK_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.FIRE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("fire_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.FIRE_PITTER_TILE_SLAB.get(), ModBlocks.FIRE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.FIRE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.FIRE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.FIRE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.FIRE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.OCHRE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("ochre_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.OCHRE_PITTER_TILE_SLAB.get(), ModBlocks.OCHRE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.OCHRE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.OCHRE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.OCHRE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.OCHRE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.EARTHY_PITTER_TILE.get(), buildSimpleBlockWithRenderType("earthy_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.EARTHY_PITTER_TILE_SLAB.get(), ModBlocks.EARTHY_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.EARTHY_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.EARTHY_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EARTHY_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.EARTHY_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PALE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pale_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PALE_PITTER_TILE_SLAB.get(), ModBlocks.PALE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PALE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PALE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PALE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PALE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.LUSH_PITTER_TILE.get(), buildSimpleBlockWithRenderType("lush_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.LUSH_PITTER_TILE_SLAB.get(), ModBlocks.LUSH_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.LUSH_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.LUSH_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LUSH_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.LUSH_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.DEEP_PITTER_TILE.get(), buildSimpleBlockWithRenderType("deep_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.DEEP_PITTER_TILE_SLAB.get(), ModBlocks.DEEP_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.DEEP_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.DEEP_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DEEP_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.DEEP_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PITCH_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pitch_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PITCH_PITTER_TILE_SLAB.get(), ModBlocks.PITCH_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PITCH_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PITCH_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PITCH_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PITCH_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PINK_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pink_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PINK_PITTER_TILE_SLAB.get(), ModBlocks.PINK_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PINK_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PINK_PITTER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_SPROUT_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_sprout_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_SPROUT_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_SPROUT_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_SPROUT_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_SPROUT_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_BLOOM_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_bloom_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_BLOOM_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_BLOOM_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_BLOOM_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_BLOOM_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_FLOWER_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_flower_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_FLOWER_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_FLOWER_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_FLOWER_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_FLOWER_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_CROSS_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_cross_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_CROSS_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_CROSS_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_CROSS_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_CROSS_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_RIDGE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_ridge_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_RIDGE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_RIDGE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_RIDGE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_RIDGE_SUMMER_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.EVE_LINED_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_lined_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_LINED_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_LINED_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_LINED_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_LINED_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_SPROUT_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_sprout_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_SPROUT_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_SPROUT_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_SPROUT_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_SPROUT_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_BLOOM_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_bloom_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_BLOOM_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_BLOOM_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_BLOOM_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_BLOOM_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_FLOWER_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_flower_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_FLOWER_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_FLOWER_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_FLOWER_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_FLOWER_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_CROSS_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_cross_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_CROSS_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_CROSS_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_CROSS_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_CROSS_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_RIDGE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_ridge_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_RIDGE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_RIDGE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_RIDGE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_RIDGE_SUMMER_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.DAY_LINED_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_lined_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_LINED_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_LINED_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_LINED_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_LINED_SUMMER_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_ROSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_ROSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_ROSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_POSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_POSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_POSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_POSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_POSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_RING_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_RING_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_RING_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_RING_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_RING_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_SQUARED_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_SQUARED_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_SQUARED_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_FULL_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_FULL_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_FULL_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_FULL_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_FULL_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_ROSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_ROSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_ROSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_ROSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_ROSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_POSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_POSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_POSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_POSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_POSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_RING_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_RING_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_RING_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_RING_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_RING_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_SQUARED_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_SQUARED_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_SQUARED_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_SQUARED_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_SQUARED_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_FULL_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_FULL_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_FULL_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_FULL_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_FULL_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.CRISP_APPLE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_APPLE_TILE_SLAB.get(), ModBlocks.CRISP_APPLE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_APPLE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_APPLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_APPLE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_APPLE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_APPLE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_APPLE_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_APPLE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_APPLE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_APPLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_APPLE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_APPLE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_ORANGE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_ORANGE_TILE_SLAB.get(), ModBlocks.CRISP_ORANGE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_ORANGE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_ORANGE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_ORANGE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_ORANGE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_ORANGE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_ORANGE_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_ORANGE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_ORANGE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_ORANGE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_ORANGE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_ORANGE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_LEMON_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_LEMON_TILE_SLAB.get(), ModBlocks.CRISP_LEMON_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_LEMON_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_LEMON_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_LEMON_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_LEMON_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_LEMON_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_LEMON_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_LEMON_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_LEMON_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_LEMON_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_LEMON_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_LEMON_TILE.get()));

        blockWithItem(ModBlocks.CRISP_LIME_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_LIME_TILE_SLAB.get(), ModBlocks.CRISP_LIME_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_LIME_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_LIME_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_LIME_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_LIME_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_LIME_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_LIME_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_LIME_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_LIME_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_LIME_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_LIME_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_LIME_TILE.get()));

        blockWithItem(ModBlocks.CRISP_BLUEBERRY_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_BLUEBERRY_TILE_SLAB.get(), ModBlocks.CRISP_BLUEBERRY_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_BLUEBERRY_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_BLUEBERRY_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_BLUEBERRY_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_BLUEBERRY_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get()));

        blockWithItem(ModBlocks.CRISP_GRAPE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_GRAPE_TILE_SLAB.get(), ModBlocks.CRISP_GRAPE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_GRAPE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_GRAPE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_GRAPE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_GRAPE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_GRAPE_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_GRAPE_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_GRAPE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_GRAPE_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_GRAPE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_GRAPE_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_GRAPE_TILE.get()));

        blockWithItem(ModBlocks.CRISP_PEACH_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_PEACH_TILE_SLAB.get(), ModBlocks.CRISP_PEACH_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_PEACH_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_PEACH_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_PEACH_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_PEACH_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_PEACH_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_PEACH_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_PEACH_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_PEACH_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_PEACH_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_PEACH_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_PEACH_TILE.get()));

        blockWithItem(ModBlocks.CRISP_COCONUT_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_COCONUT_TILE_SLAB.get(), ModBlocks.CRISP_COCONUT_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_COCONUT_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_COCONUT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_COCONUT_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_COCONUT_TILE.get()));

        blockWithItem(ModBlocks.CRISP_RIPE_COCONUT_TILE);
        genSimpleSlabsSBI(ModBlocks.CRISP_RIPE_COCONUT_TILE_SLAB.get(), ModBlocks.CRISP_RIPE_COCONUT_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.CRISP_RIPE_COCONUT_TILE_STAIRS.get()), blockTexture(ModBlocks.CRISP_RIPE_COCONUT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CRISP_RIPE_COCONUT_TILE_WALL.get()), blockTexture(ModBlocks.CRISP_RIPE_COCONUT_TILE.get()));

        blockWithItem(ModBlocks.GRID_RED_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_RED_TILE_SLAB.get(), ModBlocks.GRID_RED_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_RED_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_RED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_RED_TILE_WALL.get()), blockTexture(ModBlocks.GRID_RED_TILE.get()));

        blockWithItem(ModBlocks.GRID_PURPLE_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_PURPLE_TILE_SLAB.get(), ModBlocks.GRID_PURPLE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_PURPLE_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_PURPLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_PURPLE_TILE_WALL.get()), blockTexture(ModBlocks.GRID_PURPLE_TILE.get()));

        blockWithItem(ModBlocks.GRID_TEAL_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_TEAL_TILE_SLAB.get(), ModBlocks.GRID_TEAL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_TEAL_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_TEAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_TEAL_TILE_WALL.get()), blockTexture(ModBlocks.GRID_TEAL_TILE.get()));

        blockWithItem(ModBlocks.GRID_POOL_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_POOL_TILE_SLAB.get(), ModBlocks.GRID_POOL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_POOL_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_POOL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_POOL_TILE_WALL.get()), blockTexture(ModBlocks.GRID_POOL_TILE.get()));

        blockWithItem(ModBlocks.GRID_SAGE_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_SAGE_TILE_SLAB.get(), ModBlocks.GRID_SAGE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_SAGE_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_SAGE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_SAGE_TILE_WALL.get()), blockTexture(ModBlocks.GRID_SAGE_TILE.get()));

        blockWithItem(ModBlocks.GRID_MIXED_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_MIXED_TILE_SLAB.get(), ModBlocks.GRID_MIXED_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_MIXED_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_MIXED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_MIXED_TILE_WALL.get()), blockTexture(ModBlocks.GRID_MIXED_TILE.get()));

        blockWithItem(ModBlocks.GRID_WHITE_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_WHITE_TILE_SLAB.get(), ModBlocks.GRID_WHITE_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_WHITE_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_WHITE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_WHITE_TILE_WALL.get()), blockTexture(ModBlocks.GRID_WHITE_TILE.get()));

        blockWithItem(ModBlocks.GRID_BLACK_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_BLACK_TILE_SLAB.get(), ModBlocks.GRID_BLACK_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_BLACK_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_BLACK_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_BLACK_TILE_WALL.get()), blockTexture(ModBlocks.GRID_BLACK_TILE.get()));

        blockWithItem(ModBlocks.GRID_SEWER_TILE);
        genSimpleSlabsSBI(ModBlocks.GRID_SEWER_TILE_SLAB.get(), ModBlocks.GRID_SEWER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GRID_SEWER_TILE_STAIRS.get()), blockTexture(ModBlocks.GRID_SEWER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GRID_SEWER_TILE_WALL.get()), blockTexture(ModBlocks.GRID_SEWER_TILE.get()));

        genHorizontalSBI(ModBlocks.PINK_SPRING_TILE.get(), buildSimpleBlockWithRenderType("pink_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.PINK_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_SPRING_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.PINK_VINE_SPRING_TILE.get(), buildSimpleBlockWithRenderType("pink_vine_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.PINK_VINE_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_VINE_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_VINE_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_VINE_SPRING_TILE.get()));

        genSixSBI(ModBlocks.PINK_SPROUT_SPRING_TILE.get(), buildSimpleBlockWithRenderType("pink_sprout_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.PINK_SPROUT_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_SPROUT_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_SPROUT_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_SPROUT_SPRING_TILE.get()));

        genSixSBI(ModBlocks.PINK_BLOOM_SPRING_TILE.get(), buildSimpleBlockWithRenderType("pink_bloom_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.PINK_BLOOM_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_BLOOM_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_BLOOM_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_BLOOM_SPRING_TILE.get()));

        blockWithItem(ModBlocks.PINK_CORNER_SPRING_TILE);
        stairsBlock(((StairBlock) ModBlocks.PINK_CORNER_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_CORNER_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_CORNER_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_CORNER_SPRING_TILE.get()));

        genSixSBI(ModBlocks.PINK_FLOWER_SPRING_TILE.get(), buildSimpleBlockWithRenderType("pink_flower_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.PINK_FLOWER_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_FLOWER_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_FLOWER_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.PINK_FLOWER_SPRING_TILE.get()));

        genHorizontalSBI(ModBlocks.YELLOW_SPRING_TILE.get(), buildSimpleBlockWithRenderType("yellow_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.YELLOW_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_SPRING_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.YELLOW_VINE_SPRING_TILE.get(), buildSimpleBlockWithRenderType("yellow_vine_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.YELLOW_VINE_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_VINE_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_VINE_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_VINE_SPRING_TILE.get()));

        genSixSBI(ModBlocks.YELLOW_SPROUT_SPRING_TILE.get(), buildSimpleBlockWithRenderType("yellow_sprout_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.YELLOW_SPROUT_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_SPROUT_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_SPROUT_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_SPROUT_SPRING_TILE.get()));

        genSixSBI(ModBlocks.YELLOW_BLOOM_SPRING_TILE.get(), buildSimpleBlockWithRenderType("yellow_bloom_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.YELLOW_BLOOM_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_BLOOM_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_BLOOM_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_BLOOM_SPRING_TILE.get()));

        blockWithItem(ModBlocks.YELLOW_CORNER_SPRING_TILE);
        stairsBlock(((StairBlock) ModBlocks.YELLOW_CORNER_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_CORNER_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_CORNER_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_CORNER_SPRING_TILE.get()));

        genSixSBI(ModBlocks.YELLOW_FLOWER_SPRING_TILE.get(), buildSimpleBlockWithRenderType("yellow_flower_spring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.YELLOW_FLOWER_SPRING_TILE_STAIRS.get()), blockTexture(ModBlocks.YELLOW_FLOWER_SPRING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_FLOWER_SPRING_TILE_WALL.get()), blockTexture(ModBlocks.YELLOW_FLOWER_SPRING_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_SPLIT_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_split_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_SPLIT_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_SPLIT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_SPLIT_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_SPLIT_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_DIAMOND_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_diamond_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_DIAMOND_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_DIAMOND_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_DIAMOND_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_DIAMOND_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_HEART_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_heart_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_HEART_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_HEART_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_HEART_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_HEART_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_CIRCLE_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_circle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_CIRCLE_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_CIRCLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_CIRCLE_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_CIRCLE_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_triangle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_TRIANGLE_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_TRIANGLE_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get()));

        genSixSBI(ModBlocks.CHOCO_CUT_SQUARE_TILE.get(), buildSimpleBlockWithRenderType("choco_cut_square_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.CHOCO_CUT_SQUARE_TILE_STAIRS.get()), blockTexture(ModBlocks.CHOCO_CUT_SQUARE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.CHOCO_CUT_SQUARE_TILE_WALL.get()), blockTexture(ModBlocks.CHOCO_CUT_SQUARE_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_SPLIT_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_split_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_SPLIT_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_SPLIT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_SPLIT_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_SPLIT_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_DIAMOND_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_diamond_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_DIAMOND_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_DIAMOND_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_DIAMOND_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_DIAMOND_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_HEART_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_heart_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_HEART_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_HEART_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_HEART_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_HEART_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_CIRCLE_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_circle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_CIRCLE_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_CIRCLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_CIRCLE_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_CIRCLE_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_triangle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_TRIANGLE_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_TRIANGLE_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get()));

        genSixSBI(ModBlocks.VERDANT_CUT_SQUARE_TILE.get(), buildSimpleBlockWithRenderType("verdant_cut_square_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.VERDANT_CUT_SQUARE_TILE_STAIRS.get()), blockTexture(ModBlocks.VERDANT_CUT_SQUARE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.VERDANT_CUT_SQUARE_TILE_WALL.get()), blockTexture(ModBlocks.VERDANT_CUT_SQUARE_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_SPLIT_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_split_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_SPLIT_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_SPLIT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_SPLIT_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_SPLIT_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_DIAMOND_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_diamond_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_DIAMOND_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_DIAMOND_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_DIAMOND_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_DIAMOND_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_HEART_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_heart_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_HEART_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_HEART_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_HEART_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_HEART_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_CIRCLE_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_circle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_CIRCLE_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_CIRCLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_CIRCLE_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_CIRCLE_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_TRIANGLE_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_triangle_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_TRIANGLE_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_TRIANGLE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_TRIANGLE_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_TRIANGLE_TILE.get()));

        genSixSBI(ModBlocks.JET_CUT_SQUARE_TILE.get(), buildSimpleBlockWithRenderType("jet_cut_square_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.JET_CUT_SQUARE_TILE_STAIRS.get()), blockTexture(ModBlocks.JET_CUT_SQUARE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.JET_CUT_SQUARE_TILE_WALL.get()), blockTexture(ModBlocks.JET_CUT_SQUARE_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_FLORAL_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_FLORAL_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_FLORAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_FLORAL_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_FLORAL_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_REFINED_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_REFINED_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_REFINED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_REFINED_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_REFINED_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_SQUARED_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_SQUARED_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_SQUARED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_SQUARED_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_SQUARED_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_FISHY_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_FISHY_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_FISHY_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_FISHY_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_FISHY_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_SHELL_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_SHELL_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_SHELL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_SHELL_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_SHELL_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_CROSS_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_CROSS_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_CROSS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_CROSS_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_CROSS_TILE.get()));

        blockWithItem(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE);
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_DIAMOND_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_DIAMOND_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.WHITE_AZULEJO_LINED_TILE.get(), buildSimpleBlockWithRenderType("white_azulejo_lined_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.WHITE_AZULEJO_LINED_TILE_STAIRS.get()), blockTexture(ModBlocks.WHITE_AZULEJO_LINED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_AZULEJO_LINED_TILE_WALL.get()), blockTexture(ModBlocks.WHITE_AZULEJO_LINED_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_FLORAL_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_FLORAL_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_FLORAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_FLORAL_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_FLORAL_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_REFINED_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_REFINED_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_REFINED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_REFINED_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_REFINED_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_SQUARED_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_SQUARED_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_SQUARED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_SQUARED_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_SQUARED_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_FISHY_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_FISHY_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_FISHY_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_FISHY_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_FISHY_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_SHELL_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_SHELL_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_SHELL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_SHELL_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_SHELL_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_CROSS_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_CROSS_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_CROSS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_CROSS_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_CROSS_TILE.get()));

        blockWithItem(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE);
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_DIAMOND_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_DIAMOND_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.BLUE_AZULEJO_LINED_TILE.get(), buildSimpleBlockWithRenderType("blue_azulejo_lined_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.BLUE_AZULEJO_LINED_TILE_STAIRS.get()), blockTexture(ModBlocks.BLUE_AZULEJO_LINED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_AZULEJO_LINED_TILE_WALL.get()), blockTexture(ModBlocks.BLUE_AZULEJO_LINED_TILE.get()));

        genSixSBI(ModBlocks.SANDY_TILE.get(), buildSimpleBlockWithRenderType("sandy_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_TILE.get()));

        genSixSBI(ModBlocks.SANDY_MOROCCAN_TILE.get(), buildSimpleBlockWithRenderType("sandy_moroccan_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_MOROCCAN_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_MOROCCAN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_MOROCCAN_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_MOROCCAN_TILE.get()));

        genSixSBI(ModBlocks.SANDY_SQUARED_TILE.get(), buildSimpleBlockWithRenderType("sandy_squared_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_SQUARED_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_SQUARED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_SQUARED_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_SQUARED_TILE.get()));

        genSixSBI(ModBlocks.SANDY_RING_TILE.get(), buildSimpleBlockWithRenderType("sandy_ring_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_RING_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_RING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_RING_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_RING_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.SANDY_LINED_TILE.get(), buildSimpleBlockWithRenderType("sandy_lined_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_LINED_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_LINED_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_LINED_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_LINED_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.SANDY_STRIKE_TILE.get(), buildSimpleBlockWithRenderType("sandy_strike_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_STRIKE_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_STRIKE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_STRIKE_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_STRIKE_TILE.get()));

        genSixSBI(ModBlocks.SANDY_WAVE_TILE.get(), buildSimpleBlockWithRenderType("sandy_wave_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_WAVE_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_WAVE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_WAVE_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_WAVE_TILE.get()));

        genSixSBI(ModBlocks.SANDY_SHELL_TILE.get(), buildSimpleBlockWithRenderType("sandy_shell_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.SANDY_SHELL_TILE_STAIRS.get()), blockTexture(ModBlocks.SANDY_SHELL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.SANDY_SHELL_TILE_WALL.get()), blockTexture(ModBlocks.SANDY_SHELL_TILE.get()));

        blockWithItem(ModBlocks.WARM_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_TILE_WALL.get()), blockTexture(ModBlocks.WARM_TILE.get()));

        blockWithItem(ModBlocks.WARM_PATTERN_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_PATTERN_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_PATTERN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_PATTERN_TILE_WALL.get()), blockTexture(ModBlocks.WARM_PATTERN_TILE.get()));

        blockWithItem(ModBlocks.WARM_KNIT_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_KNIT_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_KNIT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_KNIT_TILE_WALL.get()), blockTexture(ModBlocks.WARM_KNIT_TILE.get()));

        blockWithItem(ModBlocks.WARM_CROSS_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_CROSS_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_CROSS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_CROSS_TILE_WALL.get()), blockTexture(ModBlocks.WARM_CROSS_TILE.get()));

        blockWithItem(ModBlocks.WARM_CHECKER_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_CHECKER_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_CHECKER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_CHECKER_TILE_WALL.get()), blockTexture(ModBlocks.WARM_CHECKER_TILE.get()));

        blockWithItem(ModBlocks.WARM_STEP_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_STEP_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_STEP_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_STEP_TILE_WALL.get()), blockTexture(ModBlocks.WARM_STEP_TILE.get()));

        blockWithItem(ModBlocks.WARM_CRISS_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_CRISS_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_CRISS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_CRISS_TILE_WALL.get()), blockTexture(ModBlocks.WARM_CRISS_TILE.get()));

        blockWithItem(ModBlocks.WARM_FLAKE_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_FLAKE_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_FLAKE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_FLAKE_TILE_WALL.get()), blockTexture(ModBlocks.WARM_FLAKE_TILE.get()));

        blockWithItem(ModBlocks.WARM_EDGE_TILE);
        stairsBlock(((StairBlock) ModBlocks.WARM_EDGE_TILE_STAIRS.get()), blockTexture(ModBlocks.WARM_EDGE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.WARM_EDGE_TILE_WALL.get()), blockTexture(ModBlocks.WARM_EDGE_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_PATTERN_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_PATTERN_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_PATTERN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_PATTERN_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_PATTERN_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_KNIT_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_KNIT_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_KNIT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_KNIT_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_KNIT_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_CROSS_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_CROSS_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_CROSS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_CROSS_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_CROSS_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_CHECKER_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_CHECKER_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_CHECKER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_CHECKER_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_CHECKER_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_STEP_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_STEP_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_STEP_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_STEP_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_STEP_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_CRISS_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_CRISS_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_CRISS_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_CRISS_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_CRISS_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_FLAKE_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_FLAKE_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_FLAKE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_FLAKE_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_FLAKE_TILE.get()));

        blockWithItem(ModBlocks.LAVENDER_EDGE_TILE);
        stairsBlock(((StairBlock) ModBlocks.LAVENDER_EDGE_TILE_STAIRS.get()), blockTexture(ModBlocks.LAVENDER_EDGE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LAVENDER_EDGE_TILE_WALL.get()), blockTexture(ModBlocks.LAVENDER_EDGE_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_TILE.get(), buildSimpleBlockWithRenderType("endleline_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_CENTRA_TILE.get(), buildSimpleBlockWithRenderType("endleline_centra_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_CENTRA_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_CENTRA_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_CENTRA_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_CENTRA_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_FIGURE_TILE.get(), buildSimpleBlockWithRenderType("endleline_figure_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_FIGURE_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_FIGURE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_FIGURE_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_FIGURE_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_FLOWARD_TILE.get(), buildSimpleBlockWithRenderType("endleline_floward_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_FLOWARD_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_FLOWARD_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_FLOWARD_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_FLOWARD_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_INWARD_TILE.get(), buildSimpleBlockWithRenderType("endleline_inward_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_INWARD_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_INWARD_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_INWARD_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_INWARD_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_RECT_TILE.get(), buildSimpleBlockWithRenderType("endleline_rect_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_RECT_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_RECT_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_RECT_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_RECT_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_SEEPING_TILE.get(), buildSimpleBlockWithRenderType("endleline_seeping_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_SEEPING_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_SEEPING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_SEEPING_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_SEEPING_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_SWIRL_TILE.get(), buildSimpleBlockWithRenderType("endleline_swirl_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_SWIRL_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_SWIRL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_SWIRL_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_SWIRL_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_TOWER_TILE.get(), buildSimpleBlockWithRenderType("endleline_tower_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_TOWER_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_TOWER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_TOWER_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_TOWER_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_TURN_TILE.get(), buildSimpleBlockWithRenderType("endleline_turn_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_TURN_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_TURN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_TURN_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_TURN_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_ZING_TILE.get(), buildSimpleBlockWithRenderType("endleline_zing_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_ZING_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_ZING_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_ZING_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_ZING_TILE.get()));

        genSixSBI(ModBlocks.ENDLELINE_ZUNE_TILE.get(), buildSimpleBlockWithRenderType("endleline_zune_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.ENDLELINE_ZUNE_TILE_STAIRS.get()), blockTexture(ModBlocks.ENDLELINE_ZUNE_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.ENDLELINE_ZUNE_TILE_WALL.get()), blockTexture(ModBlocks.ENDLELINE_ZUNE_TILE.get()));

        genSixSBI(ModBlocks.GLIST_TILE.get(), buildSimpleBlockWithRenderType("glist_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_TILE_SLAB.get(), ModBlocks.GLIST_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_TILE.get()));

        genSixSBI(ModBlocks.GLIST_FANCIFUL_TILE.get(), buildSimpleBlockWithRenderType("glist_fanciful_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_FANCIFUL_TILE_SLAB.get(), ModBlocks.GLIST_FANCIFUL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_FANCIFUL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_FANCIFUL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_FANCIFUL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_FANCIFUL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_FAN_TILE.get(), buildSimpleBlockWithRenderType("glist_fan_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_FAN_TILE_SLAB.get(), ModBlocks.GLIST_FAN_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_FAN_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_FAN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_FAN_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_FAN_TILE.get()));

        genSixSBI(ModBlocks.GLIST_FLORAL_TILE.get(), buildSimpleBlockWithRenderType("glist_floral_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_FLORAL_TILE_SLAB.get(), ModBlocks.GLIST_FLORAL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_FLORAL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_FLORAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_FLORAL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_FLORAL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_STAR_TILE.get(), buildSimpleBlockWithRenderType("glist_star_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_STAR_TILE_SLAB.get(), ModBlocks.GLIST_STAR_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_STAR_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_STAR_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_STAR_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_STAR_TILE.get()));

        genSixSBI(ModBlocks.GLIST_LINK_TILE.get(), buildSimpleBlockWithRenderType("glist_link_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_LINK_TILE_SLAB.get(), ModBlocks.GLIST_LINK_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_LINK_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_LINK_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_LINK_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_LINK_TILE.get()));

        genSixSBI(ModBlocks.GLIST_SCRATCH_TILE.get(), buildSimpleBlockWithRenderType("glist_scratch_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_SCRATCH_TILE_SLAB.get(), ModBlocks.GLIST_SCRATCH_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_SCRATCH_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_SCRATCH_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_SCRATCH_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_SCRATCH_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_fanciful_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_FAN_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_fan_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_FAN_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_FAN_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_FAN_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FAN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_FAN_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FAN_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_FLORAL_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_floral_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_FLORAL_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_FLORAL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_FLORAL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FLORAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_FLORAL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_FLORAL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_STAR_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_star_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_STAR_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_STAR_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_STAR_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_STAR_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_STAR_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_STAR_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_LINK_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_link_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_LINK_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_LINK_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_LINK_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_LINK_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_LINK_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_LINK_TILE.get()));

        genSixSBI(ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE.get(), buildSimpleBlockWithRenderType("glist_neutral_scratch_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE_SLAB.get(), ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_TILE_SLAB.get(), ModBlocks.GLIST_COLD_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_FANCIFUL_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_fanciful_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_FANCIFUL_TILE_SLAB.get(), ModBlocks.GLIST_COLD_FANCIFUL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_FANCIFUL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_FANCIFUL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_FANCIFUL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_FANCIFUL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_FAN_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_fan_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_FAN_TILE_SLAB.get(), ModBlocks.GLIST_COLD_FAN_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_FAN_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_FAN_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_FAN_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_FAN_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_FLORAL_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_floral_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_FLORAL_TILE_SLAB.get(), ModBlocks.GLIST_COLD_FLORAL_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_FLORAL_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_FLORAL_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_FLORAL_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_FLORAL_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_STAR_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_star_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_STAR_TILE_SLAB.get(), ModBlocks.GLIST_COLD_STAR_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_STAR_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_STAR_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_STAR_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_STAR_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_LINK_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_link_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_LINK_TILE_SLAB.get(), ModBlocks.GLIST_COLD_LINK_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_LINK_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_LINK_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_LINK_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_LINK_TILE.get()));

        genSixSBI(ModBlocks.GLIST_COLD_SCRATCH_TILE.get(), buildSimpleBlockWithRenderType("glist_cold_scratch_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.GLIST_COLD_SCRATCH_TILE_SLAB.get(), ModBlocks.GLIST_COLD_SCRATCH_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.GLIST_COLD_SCRATCH_TILE_STAIRS.get()), blockTexture(ModBlocks.GLIST_COLD_SCRATCH_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.GLIST_COLD_SCRATCH_TILE_WALL.get()), blockTexture(ModBlocks.GLIST_COLD_SCRATCH_TILE.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private ModelFile buildSimpleBlockWithRenderType(String blockName, String renderType) {
        //Builds a textured model that uses six texture .pngs for all 6 faces.

        return models().cubeAll(
                blockName,
                modLoc( "block/" + blockName)
        ).texture("particle", modLoc("block/" + blockName)).renderType(renderType);
    }

    private void genSimpleBlockWithRenderTypeSBI(Block block, String renderType) {
        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        simpleBlock(block, buildSimpleBlockWithRenderType(stringName, renderType));

        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    private void genHorizontalSBI(Block block, ModelFile model) {
        horizontalBlock(block, model);

        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    private void genPillarRotationSBI(RotatedPillarBlock block, ModelFile model) {
        axisBlock(block, model, model);

        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    private void genSixSBI(SixDirectionBlock block, ModelFile model) {
        directionalBlock(block, model);

        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }


    private void genSimpleSlabsSBI(Block block, Block parentBlock) {
        //For slabs which have a homogenous texture and solid model
        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();

        slabBlock(((SlabBlock) block), blockTexture(parentBlock), blockTexture(parentBlock));

        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    public static class SixDirectionBlock extends DirectionalBlock {

        private static MapCodec<SixDirectionBlock> codec() {return null;}

        public SixDirectionBlock(BlockBehaviour.Properties properties) { super(properties); }

        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        public BlockState getStateForPlacement(BlockPlaceContext context) {
            Direction clickedFaceDirection = context.getClickedFace();
            return this.defaultBlockState().setValue(FACING, clickedFaceDirection);
        }
    }
}
