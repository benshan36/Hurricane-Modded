architectury {
    common("neoforge", "fabric")
}

loom {
    mixin.defaultRefmapName.set("hurricane-refmap.json")
}

dependencies {
    compileOnly(libs.floodgate.api)
    compileOnly(libs.geyser.api)

    api(libs.configurate.hocon)

    compileOnly(libs.mixin)
    compileOnly(libs.asm)

    // Only here to suppress "unknown enum constant EnvType.CLIENT" warnings.
    compileOnly(libs.fabric.loader)
}