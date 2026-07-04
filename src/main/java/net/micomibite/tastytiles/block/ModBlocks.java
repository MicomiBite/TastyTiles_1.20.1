package net.micomibite.tastytiles.block;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.datagen.ModBlockStateProvider;
import net.micomibite.tastytiles.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TastyTiles.MOD_ID);

    //Brick Pitter Tiles
    public static final RegistryObject<Block> BRICK_PITTER_TILE = registerBlock("brick_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BRICK_PITTER_TILE_SLAB = registerBlock("brick_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BRICK_PITTER_TILE_STAIRS = registerBlock("brick_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BRICK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BRICK_PITTER_TILE_WALL = registerBlock("brick_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Fire Pitter Tiles
    public static final RegistryObject<Block> FIRE_PITTER_TILE = registerBlock("fire_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> FIRE_PITTER_TILE_SLAB = registerBlock("fire_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> FIRE_PITTER_TILE_STAIRS = registerBlock("fire_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.FIRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> FIRE_PITTER_TILE_WALL = registerBlock("fire_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Ochre Pitter Tile
    public static final RegistryObject<Block> OCHRE_PITTER_TILE = registerBlock("ochre_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_SLAB = registerBlock("ochre_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_STAIRS = registerBlock("ochre_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.OCHRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_WALL = registerBlock("ochre_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Earthy Pitter Tiles
    public static final RegistryObject<Block> EARTHY_PITTER_TILE = registerBlock("earthy_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_SLAB = registerBlock("earthy_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_STAIRS = registerBlock("earthy_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EARTHY_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_WALL = registerBlock("earthy_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pale Pitter Tiles
    public static final RegistryObject<Block> PALE_PITTER_TILE = registerBlock("pale_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PALE_PITTER_TILE_SLAB = registerBlock("pale_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PALE_PITTER_TILE_STAIRS = registerBlock("pale_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PALE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PALE_PITTER_TILE_WALL = registerBlock("pale_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Lush Pitter Tile
    public static final RegistryObject<Block> LUSH_PITTER_TILE = registerBlock("lush_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LUSH_PITTER_TILE_SLAB = registerBlock("lush_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LUSH_PITTER_TILE_STAIRS = registerBlock("lush_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LUSH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LUSH_PITTER_TILE_WALL = registerBlock("lush_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Deep Pitter Tile
    public static final RegistryObject<Block> DEEP_PITTER_TILE = registerBlock("deep_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DEEP_PITTER_TILE_SLAB = registerBlock("deep_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DEEP_PITTER_TILE_STAIRS = registerBlock("deep_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DEEP_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DEEP_PITTER_TILE_WALL = registerBlock("deep_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pitch Pitter Tile
    public static final RegistryObject<Block> PITCH_PITTER_TILE = registerBlock("pitch_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PITCH_PITTER_TILE_SLAB = registerBlock("pitch_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PITCH_PITTER_TILE_STAIRS = registerBlock("pitch_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PITCH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PITCH_PITTER_TILE_WALL = registerBlock("pitch_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pink Pitter Tiles
    public static final RegistryObject<Block> PINK_PITTER_TILE = registerBlock("pink_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_PITTER_TILE_SLAB = registerBlock("pink_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_PITTER_TILE_STAIRS = registerBlock("pink_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_PITTER_TILE_WALL = registerBlock("pink_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE SUMMER TILE
    public static final RegistryObject<Block> EVE_SUMMER_TILE = registerBlock("eve_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SUMMER_TILE_SLAB = registerBlock("eve_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SUMMER_TILE_STAIRS = registerBlock("eve_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_SUMMER_TILE_WALL = registerBlock("eve_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE SPROUT SUMMER TILE
    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE = registerBlock("eve_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_SLAB = registerBlock("eve_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_STAIRS = registerBlock("eve_sprout_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_WALL = registerBlock("eve_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE BLOOM SUMMER TILE
    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE = registerBlock("eve_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_SLAB = registerBlock("eve_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_STAIRS = registerBlock("eve_bloom_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_WALL = registerBlock("eve_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE FLOWER SUMMER TILE
    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE = registerBlock("eve_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_SLAB = registerBlock("eve_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_STAIRS = registerBlock("eve_flower_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_WALL = registerBlock("eve_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE CROSS SUMMER TILE
    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE = registerBlock("eve_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_SLAB = registerBlock("eve_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_STAIRS = registerBlock("eve_cross_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_WALL = registerBlock("eve_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE RIDGE SUMMER TILE
    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE = registerBlock("eve_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_SLAB = registerBlock("eve_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_STAIRS = registerBlock("eve_ridge_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_WALL = registerBlock("eve_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE LINED SUMMER TILE
    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE = registerBlock("eve_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_SLAB = registerBlock("eve_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_STAIRS = registerBlock("eve_lined_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_WALL = registerBlock("eve_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY SUMMER TILE
    public static final RegistryObject<Block> DAY_SUMMER_TILE = registerBlock("day_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SUMMER_TILE_SLAB = registerBlock("day_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SUMMER_TILE_STAIRS = registerBlock("day_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_SUMMER_TILE_WALL = registerBlock("day_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY SPROUT SUMMER TILE
    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE = registerBlock("day_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_SLAB = registerBlock("day_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_STAIRS = registerBlock("day_sprout_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_WALL = registerBlock("day_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY BLOOM SUMMER TILE
    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE = registerBlock("day_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_SLAB = registerBlock("day_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_STAIRS = registerBlock("day_bloom_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_WALL = registerBlock("day_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY FLOWER SUMMER TILE
    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE = registerBlock("day_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_SLAB = registerBlock("day_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_STAIRS = registerBlock("day_flower_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_WALL = registerBlock("day_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY CROSS SUMMER TILE
    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE = registerBlock("day_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_SLAB = registerBlock("day_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_STAIRS = registerBlock("day_cross_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_WALL = registerBlock("day_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY RIDGE SUMMER TILE
    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE = registerBlock("day_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_SLAB = registerBlock("day_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_STAIRS = registerBlock("day_ridge_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_WALL = registerBlock("day_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY LINED SUMMER TILE
    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE = registerBlock("day_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_SLAB = registerBlock("day_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_STAIRS = registerBlock("day_lined_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_WALL = registerBlock("day_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));
    
    //LIGHT PRETTI TILE
    public static final RegistryObject<Block> LIGHT_PRETTI_TILE = registerBlock("light_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_SLAB = registerBlock("light_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_STAIRS = registerBlock("light_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_WALL = registerBlock("light_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT ROSY PRETTI TILE
    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE = registerBlock("light_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_SLAB = registerBlock("light_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_STAIRS = registerBlock("light_rosy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_WALL = registerBlock("light_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT POSY PRETTI TILE
    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE = registerBlock("light_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_SLAB = registerBlock("light_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_STAIRS = registerBlock("light_posy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_WALL = registerBlock("light_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT RING PRETTI TILE
    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE = registerBlock("light_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_SLAB = registerBlock("light_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_STAIRS = registerBlock("light_ring_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_WALL = registerBlock("light_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT SQUARED PRETTI TILE
    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE = registerBlock("light_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_SLAB = registerBlock("light_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_STAIRS = registerBlock("light_squared_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_WALL = registerBlock("light_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT FULL PRETTI TILE
    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE = registerBlock("light_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_SLAB = registerBlock("light_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_STAIRS = registerBlock("light_full_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_WALL = registerBlock("light_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK PRETTI TILE
    public static final RegistryObject<Block> DARK_PRETTI_TILE = registerBlock("dark_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_PRETTI_TILE_SLAB = registerBlock("dark_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_PRETTI_TILE_STAIRS = registerBlock("dark_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_PRETTI_TILE_WALL = registerBlock("dark_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK ROSY PRETTI TILE
    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE = registerBlock("dark_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_SLAB = registerBlock("dark_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_STAIRS = registerBlock("dark_rosy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_WALL = registerBlock("dark_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK POSY PRETTI TILE
    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE = registerBlock("dark_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_SLAB = registerBlock("dark_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_STAIRS = registerBlock("dark_posy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_WALL = registerBlock("dark_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK RING PRETTI TILE
    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE = registerBlock("dark_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_SLAB = registerBlock("dark_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_STAIRS = registerBlock("dark_ring_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_WALL = registerBlock("dark_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK SQUARED PRETTI TILE
    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE = registerBlock("dark_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_SLAB = registerBlock("dark_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_STAIRS = registerBlock("dark_squared_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_WALL = registerBlock("dark_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK FULL PRETTI TILE
    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE = registerBlock("dark_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_SLAB = registerBlock("dark_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_STAIRS = registerBlock("dark_full_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_WALL = registerBlock("dark_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CRISP ORANGE TILES
    public static final RegistryObject<Block> CRISP_ORANGE_TILE = registerBlock("crisp_orange_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_SLAB = registerBlock("crisp_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_STAIRS = registerBlock("crisp_orange_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_WALL = registerBlock("crisp_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE ORANGE TILES
    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE = registerBlock("crisp_ripe_orange_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_SLAB = registerBlock("crisp_ripe_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_STAIRS = registerBlock("crisp_ripe_orange_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_WALL = registerBlock("crisp_ripe_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP LEMON TILES
    public static final RegistryObject<Block> CRISP_LEMON_TILE = registerBlock("crisp_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_LEMON_TILE_SLAB = registerBlock("crisp_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_LEMON_TILE_STAIRS = registerBlock("crisp_lemon_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_LEMON_TILE_WALL = registerBlock("crisp_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE LEMON TILES
    public static final RegistryObject<Block> CRISP_RIPE_LEMON_TILE = registerBlock("crisp_ripe_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_LEMON_TILE_SLAB = registerBlock("crisp_ripe_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_LEMON_TILE_STAIRS = registerBlock("crisp_ripe_lemon_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_LEMON_TILE_WALL = registerBlock("crisp_ripe_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP LIME TILES
    public static final RegistryObject<Block> CRISP_LIME_TILE = registerBlock("crisp_lime_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_LIME_TILE_SLAB = registerBlock("crisp_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_LIME_TILE_STAIRS = registerBlock("crisp_lime_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_LIME_TILE_WALL = registerBlock("crisp_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE LIME TILES
    public static final RegistryObject<Block> CRISP_RIPE_LIME_TILE = registerBlock("crisp_ripe_lime_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_LIME_TILE_SLAB = registerBlock("crisp_ripe_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_LIME_TILE_STAIRS = registerBlock("crisp_ripe_lime_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_LIME_TILE_WALL = registerBlock("crisp_ripe_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP BLUEBERRY TILES
    public static final RegistryObject<Block> CRISP_BLUEBERRY_TILE = registerBlock("crisp_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_BLUEBERRY_TILE_SLAB = registerBlock("crisp_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_blueberry_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_BLUEBERRY_TILE_WALL = registerBlock("crisp_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE BLUEBERRY TILES
    public static final RegistryObject<Block> CRISP_RIPE_BLUEBERRY_TILE = registerBlock("crisp_ripe_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_BLUEBERRY_TILE_SLAB = registerBlock("crisp_ripe_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_ripe_blueberry_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_BLUEBERRY_TILE_WALL = registerBlock("crisp_ripe_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP GRAPE TILES
    public static final RegistryObject<Block> CRISP_GRAPE_TILE = registerBlock("crisp_grape_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_GRAPE_TILE_SLAB = registerBlock("crisp_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_GRAPE_TILE_STAIRS = registerBlock("crisp_grape_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_GRAPE_TILE_WALL = registerBlock("crisp_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE GRAPE TILES
    public static final RegistryObject<Block> CRISP_RIPE_GRAPE_TILE = registerBlock("crisp_ripe_grape_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_GRAPE_TILE_SLAB = registerBlock("crisp_ripe_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_GRAPE_TILE_STAIRS = registerBlock("crisp_ripe_grape_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_GRAPE_TILE_WALL = registerBlock("crisp_ripe_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP PEACH TILES
    public static final RegistryObject<Block> CRISP_PEACH_TILE = registerBlock("crisp_peach_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_PEACH_TILE_SLAB = registerBlock("crisp_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_PEACH_TILE_STAIRS = registerBlock("crisp_peach_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_PEACH_TILE_WALL = registerBlock("crisp_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE PEACH TILES
    public static final RegistryObject<Block> CRISP_RIPE_PEACH_TILE = registerBlock("crisp_ripe_peach_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_PEACH_TILE_SLAB = registerBlock("crisp_ripe_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_PEACH_TILE_STAIRS = registerBlock("crisp_ripe_peach_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_PEACH_TILE_WALL = registerBlock("crisp_ripe_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP CLEAR TILES
    public static final RegistryObject<Block> CRISP_CLEAR_TILE = registerBlock("crisp_clear_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_CLEAR_TILE_SLAB = registerBlock("crisp_clear_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_CLEAR_TILE_STAIRS = registerBlock("crisp_clear_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_CLEAR_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_CLEAR_TILE_WALL = registerBlock("crisp_clear_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE CLEAR TILES
    public static final RegistryObject<Block> CRISP_RIPE_CLEAR_TILE = registerBlock("crisp_ripe_clear_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_CLEAR_TILE_SLAB = registerBlock("crisp_ripe_clear_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_CLEAR_TILE_STAIRS = registerBlock("crisp_ripe_clear_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_CLEAR_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_CLEAR_TILE_WALL = registerBlock("crisp_ripe_clear_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID RED TILES
    public static final RegistryObject<Block> GRID_RED_TILE = registerBlock("grid_red_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_RED_TILE_SLAB = registerBlock("grid_red_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_RED_TILE_STAIRS = registerBlock("grid_red_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_RED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_RED_TILE_WALL = registerBlock("grid_red_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID PURPLE TILES
    public static final RegistryObject<Block> GRID_PURPLE_TILE = registerBlock("grid_purple_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_PURPLE_TILE_SLAB = registerBlock("grid_purple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_PURPLE_TILE_STAIRS = registerBlock("grid_purple_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_PURPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_PURPLE_TILE_WALL = registerBlock("grid_purple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID TEAL TILES
    public static final RegistryObject<Block> GRID_TEAL_TILE = registerBlock("grid_teal_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_TEAL_TILE_SLAB = registerBlock("grid_teal_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_TEAL_TILE_STAIRS = registerBlock("grid_teal_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_TEAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_TEAL_TILE_WALL = registerBlock("grid_teal_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID POOL TILES
    public static final RegistryObject<Block> GRID_POOL_TILE = registerBlock("grid_pool_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_POOL_TILE_SLAB = registerBlock("grid_pool_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_POOL_TILE_STAIRS = registerBlock("grid_pool_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_POOL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_POOL_TILE_WALL = registerBlock("grid_pool_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID SAGE TILES
    public static final RegistryObject<Block> GRID_SAGE_TILE = registerBlock("grid_sage_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_SAGE_TILE_SLAB = registerBlock("grid_sage_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_SAGE_TILE_STAIRS = registerBlock("grid_sage_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_SAGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_SAGE_TILE_WALL = registerBlock("grid_sage_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID MIXED TILES
    public static final RegistryObject<Block> GRID_MIXED_TILE = registerBlock("grid_mixed_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_MIXED_TILE_SLAB = registerBlock("grid_mixed_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_MIXED_TILE_STAIRS = registerBlock("grid_mixed_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_MIXED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_MIXED_TILE_WALL = registerBlock("grid_mixed_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID WHITE TILES
    public static final RegistryObject<Block> GRID_WHITE_TILE = registerBlock("grid_white_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_WHITE_TILE_SLAB = registerBlock("grid_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_WHITE_TILE_STAIRS = registerBlock("grid_white_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_WHITE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_WHITE_TILE_WALL = registerBlock("grid_white_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID BLACK TILES
    public static final RegistryObject<Block> GRID_BLACK_TILE = registerBlock("grid_black_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_BLACK_TILE_SLAB = registerBlock("grid_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_BLACK_TILE_STAIRS = registerBlock("grid_black_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_BLACK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_BLACK_TILE_WALL = registerBlock("grid_black_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //GRID SEWER TILES
    public static final RegistryObject<Block> GRID_SEWER_TILE = registerBlock("grid_sewer_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_SEWER_TILE_SLAB = registerBlock("grid_sewer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> GRID_SEWER_TILE_STAIRS = registerBlock("grid_sewer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.GRID_SEWER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRID_SEWER_TILE_WALL = registerBlock("grid_sewer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //PINK SPRING TILES
    public static final RegistryObject<Block> PINK_SPRING_TILE = registerBlock("pink_spring_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_SPRING_TILE_SLAB = registerBlock("pink_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_SPRING_TILE_STAIRS = registerBlock("pink_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_SPRING_TILE_WALL = registerBlock("pink_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //PINK VINE SPRING TILES
    public static final RegistryObject<Block> PINK_VINE_SPRING_TILE = registerBlock("pink_vine_spring_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_VINE_SPRING_TILE_SLAB = registerBlock("pink_vine_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_VINE_SPRING_TILE_STAIRS = registerBlock("pink_vine_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_VINE_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_VINE_SPRING_TILE_WALL = registerBlock("pink_vine_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //PINK SPROUT SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> PINK_SPROUT_SPRING_TILE = registerBlock("pink_sprout_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_SPROUT_SPRING_TILE_SLAB = registerBlock("pink_sprout_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_SPROUT_SPRING_TILE_STAIRS = registerBlock("pink_sprout_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_SPROUT_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_SPROUT_SPRING_TILE_WALL = registerBlock("pink_sprout_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //PINK BLOOM SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> PINK_BLOOM_SPRING_TILE = registerBlock("pink_bloom_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_BLOOM_SPRING_TILE_SLAB = registerBlock("pink_bloom_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_BLOOM_SPRING_TILE_STAIRS = registerBlock("pink_bloom_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_BLOOM_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_BLOOM_SPRING_TILE_WALL = registerBlock("pink_bloom_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //PINK CORNER TILE
    public static final RegistryObject<Block> PINK_CORNER_SPRING_TILE = registerBlock("pink_corner_spring_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_CORNER_SPRING_TILE_SLAB = registerBlock("pink_corner_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_CORNER_SPRING_TILE_STAIRS = registerBlock("pink_corner_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_CORNER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_CORNER_SPRING_TILE_WALL = registerBlock("pink_corner_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //PINK FLOWER SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> PINK_FLOWER_SPRING_TILE = registerBlock("pink_flower_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.PINK_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_FLOWER_SPRING_TILE_SLAB = registerBlock("pink_flower_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_FLOWER_SPRING_TILE_STAIRS = registerBlock("pink_flower_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_FLOWER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_FLOWER_SPRING_TILE_WALL = registerBlock("pink_flower_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW SPRING TILES
    public static final RegistryObject<Block> YELLOW_SPRING_TILE = registerBlock("yellow_spring_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_SPRING_TILE_SLAB = registerBlock("yellow_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_SPRING_TILE_STAIRS = registerBlock("yellow_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_SPRING_TILE_WALL = registerBlock("yellow_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW VINE SPRING TILES
    public static final RegistryObject<Block> YELLOW_VINE_SPRING_TILE = registerBlock("yellow_vine_spring_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_VINE_SPRING_TILE_SLAB = registerBlock("yellow_vine_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_VINE_SPRING_TILE_STAIRS = registerBlock("yellow_vine_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_VINE_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_VINE_SPRING_TILE_WALL = registerBlock("yellow_vine_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW SPROUT SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> YELLOW_SPROUT_SPRING_TILE = registerBlock("yellow_sprout_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_SPROUT_SPRING_TILE_SLAB = registerBlock("yellow_sprout_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_SPROUT_SPRING_TILE_STAIRS = registerBlock("yellow_sprout_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_SPROUT_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_SPROUT_SPRING_TILE_WALL = registerBlock("yellow_sprout_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW BLOOM SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> YELLOW_BLOOM_SPRING_TILE = registerBlock("yellow_bloom_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_BLOOM_SPRING_TILE_SLAB = registerBlock("yellow_bloom_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_BLOOM_SPRING_TILE_STAIRS = registerBlock("yellow_bloom_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BLOOM_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_BLOOM_SPRING_TILE_WALL = registerBlock("yellow_bloom_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW CORNER TILE
    public static final RegistryObject<Block> YELLOW_CORNER_SPRING_TILE = registerBlock("yellow_corner_spring_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_CORNER_SPRING_TILE_SLAB = registerBlock("yellow_corner_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_CORNER_SPRING_TILE_STAIRS = registerBlock("yellow_corner_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_CORNER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_CORNER_SPRING_TILE_WALL = registerBlock("yellow_corner_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //YELLOW FLOWER SPRING TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> YELLOW_FLOWER_SPRING_TILE = registerBlock("yellow_flower_spring_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_FLOWER_SPRING_TILE_SLAB = registerBlock("yellow_flower_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> YELLOW_FLOWER_SPRING_TILE_STAIRS = registerBlock("yellow_flower_spring_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_FLOWER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> YELLOW_FLOWER_SPRING_TILE_WALL = registerBlock("yellow_flower_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_TILE = registerBlock("choco_cut_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_TILE_SLAB = registerBlock("choco_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_TILE_STAIRS = registerBlock("choco_cut_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_TILE_WALL = registerBlock("choco_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT SPLIT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_SPLIT_TILE = registerBlock("choco_cut_split_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_SPLIT_TILE_SLAB = registerBlock("choco_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_SPLIT_TILE_STAIRS = registerBlock("choco_cut_split_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_SPLIT_TILE_WALL = registerBlock("choco_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT DIAMOND TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_DIAMOND_TILE = registerBlock("choco_cut_diamond_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_DIAMOND_TILE_SLAB = registerBlock("choco_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_DIAMOND_TILE_STAIRS = registerBlock("choco_cut_diamond_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_DIAMOND_TILE_WALL = registerBlock("choco_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT HEART TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_HEART_TILE = registerBlock("choco_cut_heart_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_HEART_TILE_SLAB = registerBlock("choco_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_HEART_TILE_STAIRS = registerBlock("choco_cut_heart_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_HEART_TILE_WALL = registerBlock("choco_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT CIRCLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_CIRCLE_TILE = registerBlock("choco_cut_circle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_CIRCLE_TILE_SLAB = registerBlock("choco_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_CIRCLE_TILE_STAIRS = registerBlock("choco_cut_circle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_CIRCLE_TILE_WALL = registerBlock("choco_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT TRIANGLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_TRIANGLE_TILE = registerBlock("choco_cut_triangle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_TRIANGLE_TILE_SLAB = registerBlock("choco_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_TRIANGLE_TILE_STAIRS = registerBlock("choco_cut_triangle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_TRIANGLE_TILE_WALL = registerBlock("choco_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CHOCO CUT SQUARE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> CHOCO_CUT_SQUARE_TILE = registerBlock("choco_cut_square_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_SQUARE_TILE_SLAB = registerBlock("choco_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> CHOCO_CUT_SQUARE_TILE_STAIRS = registerBlock("choco_cut_square_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCO_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> CHOCO_CUT_SQUARE_TILE_WALL = registerBlock("choco_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_TILE = registerBlock("verdant_cut_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_TILE_SLAB = registerBlock("verdant_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_TILE_STAIRS = registerBlock("verdant_cut_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_TILE_WALL = registerBlock("verdant_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT SPLIT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_SPLIT_TILE = registerBlock("verdant_cut_split_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_SPLIT_TILE_SLAB = registerBlock("verdant_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_SPLIT_TILE_STAIRS = registerBlock("verdant_cut_split_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_SPLIT_TILE_WALL = registerBlock("verdant_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT DIAMOND TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_DIAMOND_TILE = registerBlock("verdant_cut_diamond_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_DIAMOND_TILE_SLAB = registerBlock("verdant_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_DIAMOND_TILE_STAIRS = registerBlock("verdant_cut_diamond_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_DIAMOND_TILE_WALL = registerBlock("verdant_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT HEART TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_HEART_TILE = registerBlock("verdant_cut_heart_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_HEART_TILE_SLAB = registerBlock("verdant_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_HEART_TILE_STAIRS = registerBlock("verdant_cut_heart_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_HEART_TILE_WALL = registerBlock("verdant_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT CIRCLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_CIRCLE_TILE = registerBlock("verdant_cut_circle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_CIRCLE_TILE_SLAB = registerBlock("verdant_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_CIRCLE_TILE_STAIRS = registerBlock("verdant_cut_circle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_CIRCLE_TILE_WALL = registerBlock("verdant_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT TRIANGLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_TRIANGLE_TILE = registerBlock("verdant_cut_triangle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_TRIANGLE_TILE_SLAB = registerBlock("verdant_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_TRIANGLE_TILE_STAIRS = registerBlock("verdant_cut_triangle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_TRIANGLE_TILE_WALL = registerBlock("verdant_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //VERDANT CUT SQUARE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> VERDANT_CUT_SQUARE_TILE = registerBlock("verdant_cut_square_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_SQUARE_TILE_SLAB = registerBlock("verdant_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> VERDANT_CUT_SQUARE_TILE_STAIRS = registerBlock("verdant_cut_square_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.VERDANT_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> VERDANT_CUT_SQUARE_TILE_WALL = registerBlock("verdant_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_TILE = registerBlock("jet_cut_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_TILE_SLAB = registerBlock("jet_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_TILE_STAIRS = registerBlock("jet_cut_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_TILE_WALL = registerBlock("jet_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT SPLIT TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_SPLIT_TILE = registerBlock("jet_cut_split_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_SPLIT_TILE_SLAB = registerBlock("jet_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_SPLIT_TILE_STAIRS = registerBlock("jet_cut_split_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_SPLIT_TILE_WALL = registerBlock("jet_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT DIAMOND TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_DIAMOND_TILE = registerBlock("jet_cut_diamond_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_DIAMOND_TILE_SLAB = registerBlock("jet_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_DIAMOND_TILE_STAIRS = registerBlock("jet_cut_diamond_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_DIAMOND_TILE_WALL = registerBlock("jet_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT HEART TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_HEART_TILE = registerBlock("jet_cut_heart_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_HEART_TILE_SLAB = registerBlock("jet_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_HEART_TILE_STAIRS = registerBlock("jet_cut_heart_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_HEART_TILE_WALL = registerBlock("jet_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT CIRCLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_CIRCLE_TILE = registerBlock("jet_cut_circle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_CIRCLE_TILE_SLAB = registerBlock("jet_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_CIRCLE_TILE_STAIRS = registerBlock("jet_cut_circle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_CIRCLE_TILE_WALL = registerBlock("jet_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT TRIANGLE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_TRIANGLE_TILE = registerBlock("jet_cut_triangle_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_TRIANGLE_TILE_SLAB = registerBlock("jet_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_TRIANGLE_TILE_STAIRS = registerBlock("jet_cut_triangle_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_TRIANGLE_TILE_WALL = registerBlock("jet_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //JET CUT SQUARE TILES
    public static final RegistryObject<ModBlockStateProvider.SixDirectionBlock> JET_CUT_SQUARE_TILE = registerBlock("jet_cut_square_tile",
            () -> new ModBlockStateProvider.SixDirectionBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_SQUARE_TILE_SLAB = registerBlock("jet_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> JET_CUT_SQUARE_TILE_STAIRS = registerBlock("jet_cut_square_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.JET_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> JET_CUT_SQUARE_TILE_WALL = registerBlock("jet_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_TILE = registerBlock("white_azulejo_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_TILE_SLAB = registerBlock("white_azulejo_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_TILE_STAIRS = registerBlock("white_azulejo_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_TILE_WALL = registerBlock("white_azulejo_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO FLORAL TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_FLORAL_TILE = registerBlock("white_azulejo_floral_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_FLORAL_TILE_SLAB = registerBlock("white_azulejo_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_FLORAL_TILE_STAIRS = registerBlock("white_azulejo_floral_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_FLORAL_TILE_WALL = registerBlock("white_azulejo_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO REFINED TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_REFINED_TILE = registerBlock("white_azulejo_refined_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_REFINED_TILE_SLAB = registerBlock("white_azulejo_refined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_REFINED_TILE_STAIRS = registerBlock("white_azulejo_refined_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_REFINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_REFINED_TILE_WALL = registerBlock("white_azulejo_refined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO SQUARED TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_SQUARED_TILE = registerBlock("white_azulejo_squared_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_SQUARED_TILE_SLAB = registerBlock("white_azulejo_squared_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_SQUARED_TILE_STAIRS = registerBlock("white_azulejo_squared_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_SQUARED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_SQUARED_TILE_WALL = registerBlock("white_azulejo_squared_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO FISHY TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_FISHY_TILE = registerBlock("white_azulejo_fishy_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_FISHY_TILE_SLAB = registerBlock("white_azulejo_fishy_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_FISHY_TILE_STAIRS = registerBlock("white_azulejo_fishy_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_FISHY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_FISHY_TILE_WALL = registerBlock("white_azulejo_fishy_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO SHELL TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_SHELL_TILE = registerBlock("white_azulejo_shell_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_SHELL_TILE_SLAB = registerBlock("white_azulejo_shell_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_SHELL_TILE_STAIRS = registerBlock("white_azulejo_shell_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_SHELL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_SHELL_TILE_WALL = registerBlock("white_azulejo_shell_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO CROSS TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_CROSS_TILE = registerBlock("white_azulejo_cross_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_CROSS_TILE_SLAB = registerBlock("white_azulejo_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_CROSS_TILE_STAIRS = registerBlock("white_azulejo_cross_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_CROSS_TILE_WALL = registerBlock("white_azulejo_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO DIAMOND TILES
    public static final RegistryObject<Block> WHITE_AZULEJO_DIAMOND_TILE = registerBlock("white_azulejo_diamond_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_DIAMOND_TILE_SLAB = registerBlock("white_azulejo_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_DIAMOND_TILE_STAIRS = registerBlock("white_azulejo_diamond_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_DIAMOND_TILE_WALL = registerBlock("white_azulejo_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //WHITE AZULEJO LINED TILE
    public static final RegistryObject<Block> WHITE_AZULEJO_LINED_TILE = registerBlock("white_azulejo_lined_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_LINED_TILE_SLAB = registerBlock("white_azulejo_lined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> WHITE_AZULEJO_LINED_TILE_STAIRS = registerBlock("white_azulejo_lined_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_AZULEJO_LINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> WHITE_AZULEJO_LINED_TILE_WALL = registerBlock("white_azulejo_lined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_TILE = registerBlock("blue_azulejo_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_TILE_SLAB = registerBlock("blue_azulejo_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_TILE_STAIRS = registerBlock("blue_azulejo_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_TILE_WALL = registerBlock("blue_azulejo_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO FLORAL TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_FLORAL_TILE = registerBlock("blue_azulejo_floral_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_FLORAL_TILE_SLAB = registerBlock("blue_azulejo_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_FLORAL_TILE_STAIRS = registerBlock("blue_azulejo_floral_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_FLORAL_TILE_WALL = registerBlock("blue_azulejo_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO REFINED TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_REFINED_TILE = registerBlock("blue_azulejo_refined_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_REFINED_TILE_SLAB = registerBlock("blue_azulejo_refined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_REFINED_TILE_STAIRS = registerBlock("blue_azulejo_refined_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_REFINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_REFINED_TILE_WALL = registerBlock("blue_azulejo_refined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO SQUARED TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_SQUARED_TILE = registerBlock("blue_azulejo_squared_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_SQUARED_TILE_SLAB = registerBlock("blue_azulejo_squared_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_SQUARED_TILE_STAIRS = registerBlock("blue_azulejo_squared_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_SQUARED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_SQUARED_TILE_WALL = registerBlock("blue_azulejo_squared_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO FISHY TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_FISHY_TILE = registerBlock("blue_azulejo_fishy_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_FISHY_TILE_SLAB = registerBlock("blue_azulejo_fishy_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_FISHY_TILE_STAIRS = registerBlock("blue_azulejo_fishy_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_FISHY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_FISHY_TILE_WALL = registerBlock("blue_azulejo_fishy_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO SHELL TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_SHELL_TILE = registerBlock("blue_azulejo_shell_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_SHELL_TILE_SLAB = registerBlock("blue_azulejo_shell_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_SHELL_TILE_STAIRS = registerBlock("blue_azulejo_shell_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_SHELL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_SHELL_TILE_WALL = registerBlock("blue_azulejo_shell_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO CROSS TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_CROSS_TILE = registerBlock("blue_azulejo_cross_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_CROSS_TILE_SLAB = registerBlock("blue_azulejo_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_CROSS_TILE_STAIRS = registerBlock("blue_azulejo_cross_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_CROSS_TILE_WALL = registerBlock("blue_azulejo_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO DIAMOND TILES
    public static final RegistryObject<Block> BLUE_AZULEJO_DIAMOND_TILE = registerBlock("blue_azulejo_diamond_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_DIAMOND_TILE_SLAB = registerBlock("blue_azulejo_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_DIAMOND_TILE_STAIRS = registerBlock("blue_azulejo_diamond_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_DIAMOND_TILE_WALL = registerBlock("blue_azulejo_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //BLUE AZULEJO LINED TILE
    public static final RegistryObject<Block> BLUE_AZULEJO_LINED_TILE = registerBlock("blue_azulejo_lined_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_LINED_TILE_SLAB = registerBlock("blue_azulejo_lined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BLUE_AZULEJO_LINED_TILE_STAIRS = registerBlock("blue_azulejo_lined_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_AZULEJO_LINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BLUE_AZULEJO_LINED_TILE_WALL = registerBlock("blue_azulejo_lined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));


    //Functions for making this actually work
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T>block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
