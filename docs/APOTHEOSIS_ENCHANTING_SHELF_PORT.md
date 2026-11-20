# Apotheosis enchanting shelves — source-port audit

**Status:** initial source review complete; scaffold and first 20 regular shelves implemented in the project core mod. No upstream source code, textures or assets copied. No build/game test executed yet. User-approved direction: port shelf code into the project's own core mod, keeping Apotheosis's enchanting table and Eterna/Quanta/Arcana.

## Scaffold and implementation status

- Forge/Gradle scaffold created in `mod/`: `build.gradle`, `settings.gradle`, `gradle.properties`, Gradle wrapper, `META-INF/mods.toml`, `pack.mcmeta`.
- 20 regular shelf blocks registered in `dev.godsunder.core.registry.CoreBlocks` via a shared `EnchantingShelfBlock` that implements Apotheosis `IEnchantingBlock`.
- Each shelf has a `BlockItem` registered in `CoreItems`; blockstate/model JSONs use only vanilla Minecraft textures (no copied assets).
- 20 `enchanting_stats` JSON files under `data/godsunder_core/enchanting_stats/` mirror the exact Eterna/maxEterna/Quanta/Arcana/Rectification/Clues values from Apotheosis 7.4.8 for these shelves.
- `mod/NOTICE.md` documents the Apotheosis MIT attribution and the absence of bundled upstream code/assets.
- **Build status:** not compiled. The sandbox cannot reach `services.gradle.org` or `maven.minecraftforge.net`, and no `javac`-bearing JDK is reachable; the real Forge build must run on a machine with JDK 17 and access to the Forge/CurseMaven repositories. All JSON resources validated as syntactically correct (80 files). API override signatures cross-checked against the upstream `IEnchantingBlock` source.

## Reviewed source snapshot

- Upstream repository: https://github.com/Shadows-of-Fire/Apotheosis
- Branch: `1.20`
- Commit snapshot checked: `785d26e1f755bdcd97351b33f203cb9d9a33948a`
- Relevant registration source: `src/main/java/dev/shadowsoffire/apotheosis/ench/Ench.java`
- Shelf stats: `src/main/resources/data/apotheosis/enchanting_stats/`
- Shelf behavior source: `ench/objects/TypedShelfBlock.java`, `FilteringShelfBlock.java`, `TreasureShelfBlock.java`; `ench/api/IEnchantingBlock.java`
- This branch source is not guaranteed to be byte-for-byte the same as the currently published 1.20.1 artifact; reconcile against the exact published version before porting.

## Preliminary inventory

`Ench.java` defines ordinary typed shelves: `beeshelf`, `blazing_hellshelf`, `crystal_seashelf`, `deepshelf`, `dormant_deepshelf`, `draconic_endshelf`, `echoing_deepshelf`, `endshelf`, `glowing_hellshelf`, `heart_seashelf`, `hellshelf`, `infused_hellshelf`, `infused_seashelf`, `melonshelf`, `pearl_endshelf`, `seashelf`, `sightshelf`, `sightshelf_t2`, `soul_touched_deepshelf`, `stoneshelf`.

Special blocks requiring behavior beyond a plain block: `echoing_sculkshelf` and `soul_touched_sculkshelf` use a random-ticking sculk shelf class; `filtering_shelf` stores up to six individually selected enchanted books and blacklists their enchantments; `treasure_shelf` allows treasure enchantments and alters enchanting stats. The source registration also includes rectifier blocks (`rectifier`, `rectifier_t2`, `rectifier_t3`) and library blocks (`library`, `ender_library`); confirm with the user whether “all shelves” includes these adjacent enchanting apparatus, the enchanting table, tomes and other enchanting content. Stats data also applies to vanilla amethyst clusters, skulls, and wither skulls; those are not Apotheosis shelf blocks.

Shelf stats are data-driven through `data/apotheosis/enchanting_stats/*.json`. The reviewed source uses stats such as Eterna/maxEterna, Quanta, Arcana, rectification and clues. `IEnchantingBlock` additionally describes treasure access and particle behavior. This suggests separating reusable behavior from per-shelf data rather than maintaining a hard-coded class for every numeric variant.

## Licensing and distribution gate

- The `1.20` branch `LICENSE` states MIT for software and calls out specified texture files as CC BY 4.0. Keep the copyright/license text for any copied substantial code and identify every copied/modified file.
- Do not copy textures, models, sounds, localized text, Patchouli/book content, icons or branding until each item's provenance/license is checked. Prefer newly authored art and naming for the core mod.
- MIT does not itself settle the terms of separate dependencies, CurseForge project rules, trademark use, or attribution obligations for non-MIT resources. Review all independently.
- Do not claim official affiliation. A disclaimer is good practice but does not replace license compliance.

## Important architecture finding and approved direction

**Approved scope:** port the 20 regular shelves plus the two special sculk shelves, Filtering Shelf, and Treasure Shelf. Rectifiers and Libraries are deferred. The user explicitly wants an enchanting table with Eterna, Quanta and Arcana.

**Recommended structure:** include the normal Apotheosis 1.20.1 mod in the pack and have our core mod add its shelf blocks and their Apotheosis stat integration. Keep Apotheosis' table and its Eterna/Quanta/Arcana behavior; do not reimplement that table from scratch. The shelf stats source shows the broader stat vocabulary also includes maxEterna, rectification and clues. Exact API/data compatibility must be demonstrated against the pinned 1.20.1 release before coding the integration.

The simple shelf classes are only part of the feature. Their stat integration uses Apotheosis' `IEnchantingBlock` and/or Apotheosis datapack stats; the filtering shelf also relies on Minecraft chiseled-bookshelf block entities and packet synchronization. Therefore port only the needed shelf behavior into our core mod. Avoid copying the complete enchanting module/table implementation unless the design explicitly requires replacing Apotheosis' table; that is a much larger, tightly coupled scope.

Before coding, inspect exact 1.20.1 artifact/source version and dependency/API status, then prove one shelf registration + stat contribution in a minimal Forge workspace. This is a technical spike, not a commitment to alter the enchanting table.

## Immediate next tasks

1. ~~Decide the feature boundary~~: resolved — 20 regular shelves + 2 special sculk shelves + Filtering Shelf + Treasure Shelf; Rectifiers and Libraries deferred.
2. ~~Establish a Forge 1.20.1 mod workspace~~: scaffold created in `mod/`; first 20 regular shelves implemented.
3. Run the real Forge build on a machine with JDK 17 and access to Forge/CurseMaven repositories; fix any compilation or resource errors.
4. Implement the two special sculk shelves, Filtering Shelf and Treasure Shelf (behavior beyond plain blocks: block entities, packet sync, treasure/blacklist enchantments).
5. Reconcile source commit with the exact published 1.20.1 artifact; verify license and distribution terms for the published modpack.
6. Test on dedicated server/client connection and fresh world; check save/reload and missing-mod behavior.

## Test record

- Source inspection: done for branch snapshot above.
- Exact artifact-to-source match: not verified.
- Project mod build: not started; repository has no mod project scaffold.
- In-game/client-server tests: not run.
- CurseForge distribution permission/policy review: not completed.
