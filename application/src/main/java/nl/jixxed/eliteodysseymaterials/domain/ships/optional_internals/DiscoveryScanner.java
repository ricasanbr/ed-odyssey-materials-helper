package nl.jixxed.eliteodysseymaterials.domain.ships.optional_internals;

import nl.jixxed.eliteodysseymaterials.domain.ships.ModuleClass;
import nl.jixxed.eliteodysseymaterials.domain.ships.ModuleSize;
import nl.jixxed.eliteodysseymaterials.domain.ships.OptionalModule;
import nl.jixxed.eliteodysseymaterials.enums.HorizonsBlueprintName;
import nl.jixxed.eliteodysseymaterials.enums.HorizonsBlueprintType;
import nl.jixxed.eliteodysseymaterials.enums.HorizonsModifier;

import java.util.List;
import java.util.Map;
//removed from the game
public class DiscoveryScanner extends OptionalModule {

    public static final DiscoveryScanner DISCOVERY_SCANNER_1_E = new DiscoveryScanner("DISCOVERY_SCANNER_1_E", HorizonsBlueprintName.BASIC_DISCOVERY_SCANNER, ModuleSize.SIZE_1, ModuleClass.E, false, 0, "Int_StellarBodyDiscoveryScanner_Standard", Map.ofEntries(Map.entry(HorizonsModifier.DISCOVERY_SCANNER_RANGE,  500.0)));
    public static final DiscoveryScanner DISCOVERY_SCANNER_1_E_FREE = new DiscoveryScanner("DISCOVERY_SCANNER_1_E_FREE", HorizonsBlueprintName.BASIC_DISCOVERY_SCANNER, ModuleSize.SIZE_1, ModuleClass.E, false, 0, "Int_StellarBodyDiscoveryScanner_Standard_free", Map.ofEntries(Map.entry(HorizonsModifier.DISCOVERY_SCANNER_RANGE,  500.0)));
    public static final DiscoveryScanner DISCOVERY_SCANNER_1_D = new DiscoveryScanner("DISCOVERY_SCANNER_1_D", HorizonsBlueprintName.INTERMEDIATE_DISCOVERY_SCANNER, ModuleSize.SIZE_1, ModuleClass.D, false, 0, "Int_StellarBodyDiscoveryScanner_Intermediate", Map.ofEntries(Map.entry(HorizonsModifier.DISCOVERY_SCANNER_RANGE,  1000.0)));
    public static final DiscoveryScanner DISCOVERY_SCANNER_1_C = new DiscoveryScanner("DISCOVERY_SCANNER_1_C", HorizonsBlueprintName.ADVANCED_DISCOVERY_SCANNER, ModuleSize.SIZE_1, ModuleClass.C, false, 0, "Int_StellarBodyDiscoveryScanner_Advanced", Map.ofEntries(Map.entry(HorizonsModifier.DISCOVERY_SCANNER_RANGE,  Double.POSITIVE_INFINITY)));

    public DiscoveryScanner(String id, HorizonsBlueprintName name, ModuleSize moduleSize, ModuleClass moduleClass, boolean multiCrew, long basePrice, String internalName, Map<HorizonsModifier, Object> attributes) {
        super(id, name, moduleSize, moduleClass, multiCrew, basePrice, internalName, attributes);
    }

    public DiscoveryScanner(DiscoveryScanner optionalModule) {
        super(optionalModule);
    }

    @Override
    public List<HorizonsBlueprintType> getAllowedBlueprints() {
        return List.of();
    }

    @Override
    public List<HorizonsBlueprintType> getAllowedExperimentalEffects() {
        return List.of();
    }

    @Override
    public DiscoveryScanner Clone() {
        return new DiscoveryScanner(this);
    }

    public boolean isSelectable() {
        return false;
    }
}
