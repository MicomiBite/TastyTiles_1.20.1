package net.micomibite.tastytiles.item;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TastyTiles.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TASTY_TILES_TAB = CREATIVE_MODE_TABS.register("tasty_tiles_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CERAMIC_MIXTURE.get()))
                    .title(Component.translatable("creativetab.tasty_tiles_tab"))
            .displayItems((pParameters,pOutput) -> {
            pOutput.accept(ModItems.CERAMIC_MIXTURE.get());

            pOutput.accept(ModBlocks.BRICK_PITTER_TILE.get());

            pOutput.accept(ModBlocks.BRICK_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.BRICK_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.BRICK_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.FIRE_PITTER_TILE.get());

            pOutput.accept(ModBlocks.FIRE_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.FIRE_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.FIRE_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.OCHRE_PITTER_TILE.get());

            pOutput.accept(ModBlocks.OCHRE_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.OCHRE_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.OCHRE_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EARTHY_PITTER_TILE.get());

            pOutput.accept(ModBlocks.EARTHY_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EARTHY_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EARTHY_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.PALE_PITTER_TILE.get());

            pOutput.accept(ModBlocks.PALE_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PALE_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PALE_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.LUSH_PITTER_TILE.get());

            pOutput.accept(ModBlocks.LUSH_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LUSH_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LUSH_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DEEP_PITTER_TILE.get());

            pOutput.accept(ModBlocks.DEEP_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DEEP_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DEEP_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.PITCH_PITTER_TILE.get());

            pOutput.accept(ModBlocks.PITCH_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PITCH_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PITCH_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_PITTER_TILE.get());

            pOutput.accept(ModBlocks.PINK_PITTER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_PITTER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_PITTER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_SPROUT_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_SPROUT_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_SPROUT_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_SPROUT_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_BLOOM_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_BLOOM_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_BLOOM_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_BLOOM_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_FLOWER_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_FLOWER_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_FLOWER_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_FLOWER_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_CROSS_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_CROSS_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_CROSS_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_CROSS_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_RIDGE_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_RIDGE_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_RIDGE_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_RIDGE_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.EVE_LINED_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.EVE_LINED_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.EVE_LINED_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.EVE_LINED_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_SPROUT_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_SPROUT_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_SPROUT_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_SPROUT_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_BLOOM_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_BLOOM_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_BLOOM_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_BLOOM_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_FLOWER_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_FLOWER_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_FLOWER_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_FLOWER_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_CROSS_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_CROSS_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_CROSS_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_CROSS_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_RIDGE_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_RIDGE_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_RIDGE_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_RIDGE_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.DAY_LINED_SUMMER_TILE.get());

            pOutput.accept(ModBlocks.DAY_LINED_SUMMER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DAY_LINED_SUMMER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DAY_LINED_SUMMER_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_ROSY_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_ROSY_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_ROSY_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_POSY_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_POSY_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_POSY_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_POSY_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_RING_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_RING_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_RING_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_RING_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_SQUARED_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_SQUARED_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_SQUARED_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.LIGHT_FULL_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.LIGHT_FULL_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.LIGHT_FULL_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.LIGHT_FULL_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_ROSY_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_ROSY_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_ROSY_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_ROSY_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_POSY_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_POSY_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_POSY_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_POSY_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_RING_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_RING_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_RING_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_RING_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_SQUARED_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_SQUARED_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_SQUARED_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_SQUARED_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.DARK_FULL_PRETTI_TILE.get());

            pOutput.accept(ModBlocks.DARK_FULL_PRETTI_TILE_SLAB.get());

            pOutput.accept(ModBlocks.DARK_FULL_PRETTI_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.DARK_FULL_PRETTI_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_ORANGE_TILE.get());

            pOutput.accept(ModBlocks.CRISP_ORANGE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_ORANGE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_ORANGE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_ORANGE_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_ORANGE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_ORANGE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_ORANGE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_LEMON_TILE.get());

            pOutput.accept(ModBlocks.CRISP_LEMON_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_LEMON_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_LEMON_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LEMON_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LEMON_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LEMON_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LEMON_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_LIME_TILE.get());

            pOutput.accept(ModBlocks.CRISP_LIME_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_LIME_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_LIME_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LIME_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LIME_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LIME_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_LIME_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_BLUEBERRY_TILE.get());

            pOutput.accept(ModBlocks.CRISP_BLUEBERRY_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_BLUEBERRY_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_BLUEBERRY_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_GRAPE_TILE.get());

            pOutput.accept(ModBlocks.CRISP_GRAPE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_GRAPE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_GRAPE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_GRAPE_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_GRAPE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_GRAPE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_GRAPE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_PEACH_TILE.get());

            pOutput.accept(ModBlocks.CRISP_PEACH_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_PEACH_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_PEACH_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_PEACH_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_PEACH_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_PEACH_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_PEACH_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_CLEAR_TILE.get());

            pOutput.accept(ModBlocks.CRISP_CLEAR_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_CLEAR_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_CLEAR_TILE_WALL.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_CLEAR_TILE.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_CLEAR_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_CLEAR_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CRISP_RIPE_CLEAR_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_RED_TILE.get());

            pOutput.accept(ModBlocks.GRID_RED_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_RED_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_RED_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_PURPLE_TILE.get());

            pOutput.accept(ModBlocks.GRID_PURPLE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_PURPLE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_PURPLE_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_TEAL_TILE.get());

            pOutput.accept(ModBlocks.GRID_TEAL_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_TEAL_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_TEAL_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_POOL_TILE.get());

            pOutput.accept(ModBlocks.GRID_POOL_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_POOL_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_POOL_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_SAGE_TILE.get());

            pOutput.accept(ModBlocks.GRID_SAGE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_SAGE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_SAGE_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_MIXED_TILE.get());

            pOutput.accept(ModBlocks.GRID_MIXED_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_MIXED_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_MIXED_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_WHITE_TILE.get());

            pOutput.accept(ModBlocks.GRID_WHITE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_WHITE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_WHITE_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_BLACK_TILE.get());

            pOutput.accept(ModBlocks.GRID_BLACK_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_BLACK_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_BLACK_TILE_WALL.get());

            pOutput.accept(ModBlocks.GRID_SEWER_TILE.get());

            pOutput.accept(ModBlocks.GRID_SEWER_TILE_SLAB.get());

            pOutput.accept(ModBlocks.GRID_SEWER_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.GRID_SEWER_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_VINE_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_VINE_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_VINE_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_VINE_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_SPROUT_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_SPROUT_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_SPROUT_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_SPROUT_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_BLOOM_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_BLOOM_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_BLOOM_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_BLOOM_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_CORNER_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_CORNER_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_CORNER_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_CORNER_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.PINK_FLOWER_SPRING_TILE.get());

            pOutput.accept(ModBlocks.PINK_FLOWER_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.PINK_FLOWER_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.PINK_FLOWER_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_VINE_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_VINE_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_VINE_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_VINE_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_SPROUT_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_SPROUT_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_SPROUT_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_SPROUT_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_BLOOM_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_BLOOM_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_BLOOM_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_BLOOM_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_CORNER_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_CORNER_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_CORNER_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_CORNER_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.YELLOW_FLOWER_SPRING_TILE.get());

            pOutput.accept(ModBlocks.YELLOW_FLOWER_SPRING_TILE_SLAB.get());

            pOutput.accept(ModBlocks.YELLOW_FLOWER_SPRING_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.YELLOW_FLOWER_SPRING_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SPLIT_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SPLIT_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SPLIT_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SPLIT_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_DIAMOND_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_DIAMOND_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_DIAMOND_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_DIAMOND_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_HEART_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_HEART_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_HEART_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_HEART_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_CIRCLE_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_CIRCLE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_CIRCLE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_CIRCLE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TRIANGLE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TRIANGLE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_TRIANGLE_TILE_WALL.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SQUARE_TILE.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SQUARE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SQUARE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.CHOCO_CUT_SQUARE_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SPLIT_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SPLIT_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SPLIT_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SPLIT_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_DIAMOND_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_DIAMOND_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_DIAMOND_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_DIAMOND_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_HEART_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_HEART_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_HEART_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_HEART_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_CIRCLE_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_CIRCLE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_CIRCLE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_CIRCLE_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TRIANGLE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TRIANGLE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_TRIANGLE_TILE_WALL.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SQUARE_TILE.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SQUARE_TILE_SLAB.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SQUARE_TILE_STAIRS.get());

            pOutput.accept(ModBlocks.VERDANT_CUT_SQUARE_TILE_WALL.get());

        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
