
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPartIDKeys.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPartIDKeys">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AssemblyID"/>
 *     &lt;enumeration value="BlockName"/>
 *     &lt;enumeration value="BundleItemIndex"/>
 *     &lt;enumeration value="CellIndex"/>
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="DocCopies"/>
 *     &lt;enumeration value="DocIndex"/>
 *     &lt;enumeration value="DocRunIndex"/>
 *     &lt;enumeration value="DocSheetIndex"/>
 *     &lt;enumeration value="FountainNumber"/>
 *     &lt;enumeration value="ItemNames"/>
 *     &lt;enumeration value="LayerIDs"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Option"/>
 *     &lt;enumeration value="PageNumber"/>
 *     &lt;enumeration value="PartVersion"/>
 *     &lt;enumeration value="PreflightRule"/>
 *     &lt;enumeration value="PreviewType"/>
 *     &lt;enumeration value="RibbonName"/>
 *     &lt;enumeration value="Run"/>
 *     &lt;enumeration value="RunIndex"/>
 *     &lt;enumeration value="RunTags"/>
 *     &lt;enumeration value="RunPage"/>
 *     &lt;enumeration value="Separation"/>
 *     &lt;enumeration value="SectionIndex"/>
 *     &lt;enumeration value="SetDocIndex"/>
 *     &lt;enumeration value="SetSheetIndex"/>
 *     &lt;enumeration value="SetIndex"/>
 *     &lt;enumeration value="SetRunIndex"/>
 *     &lt;enumeration value="SheetIndex"/>
 *     &lt;enumeration value="SheetName"/>
 *     &lt;enumeration value="Side"/>
 *     &lt;enumeration value="SignatureName"/>
 *     &lt;enumeration value="TileID"/>
 *     &lt;enumeration value="WebName"/>
 *     &lt;enumeration value="DeliveryUnit0"/>
 *     &lt;enumeration value="DeliveryUnit1"/>
 *     &lt;enumeration value="DeliveryUnit2"/>
 *     &lt;enumeration value="DeliveryUnit3"/>
 *     &lt;enumeration value="DeliveryUnit4"/>
 *     &lt;enumeration value="DeliveryUnit5"/>
 *     &lt;enumeration value="DeliveryUnit6"/>
 *     &lt;enumeration value="DeliveryUnit7"/>
 *     &lt;enumeration value="DeliveryUnit8"/>
 *     &lt;enumeration value="DeliveryUnit9"/>
 *     &lt;enumeration value="Edition"/>
 *     &lt;enumeration value="EditionVersion"/>
 *     &lt;enumeration value="PageTags"/>
 *     &lt;enumeration value="PlateLayout"/>
 *     &lt;enumeration value="RunSet"/>
 *     &lt;enumeration value="DocTags"/>
 *     &lt;enumeration value="SetTags"/>
 *     &lt;enumeration value="SubRun"/>
 *     &lt;enumeration value="WebProduct"/>
 *     &lt;enumeration value="StationName"/>
 *     &lt;enumeration value="WebSetup"/>
 *     &lt;enumeration value="Metadata0"/>
 *     &lt;enumeration value="Metadata1"/>
 *     &lt;enumeration value="Metadata2"/>
 *     &lt;enumeration value="Metadata3"/>
 *     &lt;enumeration value="Metadata4"/>
 *     &lt;enumeration value="Metadata5"/>
 *     &lt;enumeration value="Metadata6"/>
 *     &lt;enumeration value="Metadata7"/>
 *     &lt;enumeration value="Metadata8"/>
 *     &lt;enumeration value="Metadata9"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPartIDKeys")
@XmlEnum
public enum EnumPartIDKeys {

    @XmlEnumValue("AssemblyID")
    ASSEMBLY_ID("AssemblyID"),
    @XmlEnumValue("BlockName")
    BLOCK_NAME("BlockName"),
    @XmlEnumValue("BundleItemIndex")
    BUNDLE_ITEM_INDEX("BundleItemIndex"),
    @XmlEnumValue("CellIndex")
    CELL_INDEX("CellIndex"),
    @XmlEnumValue("Condition")
    CONDITION("Condition"),
    @XmlEnumValue("DocCopies")
    DOC_COPIES("DocCopies"),
    @XmlEnumValue("DocIndex")
    DOC_INDEX("DocIndex"),
    @XmlEnumValue("DocRunIndex")
    DOC_RUN_INDEX("DocRunIndex"),
    @XmlEnumValue("DocSheetIndex")
    DOC_SHEET_INDEX("DocSheetIndex"),
    @XmlEnumValue("FountainNumber")
    FOUNTAIN_NUMBER("FountainNumber"),
    @XmlEnumValue("ItemNames")
    ITEM_NAMES("ItemNames"),
    @XmlEnumValue("LayerIDs")
    LAYER_I_DS("LayerIDs"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Option")
    OPTION("Option"),
    @XmlEnumValue("PageNumber")
    PAGE_NUMBER("PageNumber"),
    @XmlEnumValue("PartVersion")
    PART_VERSION("PartVersion"),
    @XmlEnumValue("PreflightRule")
    PREFLIGHT_RULE("PreflightRule"),
    @XmlEnumValue("PreviewType")
    PREVIEW_TYPE("PreviewType"),
    @XmlEnumValue("RibbonName")
    RIBBON_NAME("RibbonName"),
    @XmlEnumValue("Run")
    RUN("Run"),
    @XmlEnumValue("RunIndex")
    RUN_INDEX("RunIndex"),
    @XmlEnumValue("RunTags")
    RUN_TAGS("RunTags"),
    @XmlEnumValue("RunPage")
    RUN_PAGE("RunPage"),
    @XmlEnumValue("Separation")
    SEPARATION("Separation"),
    @XmlEnumValue("SectionIndex")
    SECTION_INDEX("SectionIndex"),
    @XmlEnumValue("SetDocIndex")
    SET_DOC_INDEX("SetDocIndex"),
    @XmlEnumValue("SetSheetIndex")
    SET_SHEET_INDEX("SetSheetIndex"),
    @XmlEnumValue("SetIndex")
    SET_INDEX("SetIndex"),
    @XmlEnumValue("SetRunIndex")
    SET_RUN_INDEX("SetRunIndex"),
    @XmlEnumValue("SheetIndex")
    SHEET_INDEX("SheetIndex"),
    @XmlEnumValue("SheetName")
    SHEET_NAME("SheetName"),
    @XmlEnumValue("Side")
    SIDE("Side"),
    @XmlEnumValue("SignatureName")
    SIGNATURE_NAME("SignatureName"),
    @XmlEnumValue("TileID")
    TILE_ID("TileID"),
    @XmlEnumValue("WebName")
    WEB_NAME("WebName"),
    @XmlEnumValue("DeliveryUnit0")
    DELIVERY_UNIT_0("DeliveryUnit0"),
    @XmlEnumValue("DeliveryUnit1")
    DELIVERY_UNIT_1("DeliveryUnit1"),
    @XmlEnumValue("DeliveryUnit2")
    DELIVERY_UNIT_2("DeliveryUnit2"),
    @XmlEnumValue("DeliveryUnit3")
    DELIVERY_UNIT_3("DeliveryUnit3"),
    @XmlEnumValue("DeliveryUnit4")
    DELIVERY_UNIT_4("DeliveryUnit4"),
    @XmlEnumValue("DeliveryUnit5")
    DELIVERY_UNIT_5("DeliveryUnit5"),
    @XmlEnumValue("DeliveryUnit6")
    DELIVERY_UNIT_6("DeliveryUnit6"),
    @XmlEnumValue("DeliveryUnit7")
    DELIVERY_UNIT_7("DeliveryUnit7"),
    @XmlEnumValue("DeliveryUnit8")
    DELIVERY_UNIT_8("DeliveryUnit8"),
    @XmlEnumValue("DeliveryUnit9")
    DELIVERY_UNIT_9("DeliveryUnit9"),
    @XmlEnumValue("Edition")
    EDITION("Edition"),
    @XmlEnumValue("EditionVersion")
    EDITION_VERSION("EditionVersion"),
    @XmlEnumValue("PageTags")
    PAGE_TAGS("PageTags"),
    @XmlEnumValue("PlateLayout")
    PLATE_LAYOUT("PlateLayout"),
    @XmlEnumValue("RunSet")
    RUN_SET("RunSet"),
    @XmlEnumValue("DocTags")
    DOC_TAGS("DocTags"),
    @XmlEnumValue("SetTags")
    SET_TAGS("SetTags"),
    @XmlEnumValue("SubRun")
    SUB_RUN("SubRun"),
    @XmlEnumValue("WebProduct")
    WEB_PRODUCT("WebProduct"),
    @XmlEnumValue("StationName")
    STATION_NAME("StationName"),
    @XmlEnumValue("WebSetup")
    WEB_SETUP("WebSetup"),
    @XmlEnumValue("Metadata0")
    METADATA_0("Metadata0"),
    @XmlEnumValue("Metadata1")
    METADATA_1("Metadata1"),
    @XmlEnumValue("Metadata2")
    METADATA_2("Metadata2"),
    @XmlEnumValue("Metadata3")
    METADATA_3("Metadata3"),
    @XmlEnumValue("Metadata4")
    METADATA_4("Metadata4"),
    @XmlEnumValue("Metadata5")
    METADATA_5("Metadata5"),
    @XmlEnumValue("Metadata6")
    METADATA_6("Metadata6"),
    @XmlEnumValue("Metadata7")
    METADATA_7("Metadata7"),
    @XmlEnumValue("Metadata8")
    METADATA_8("Metadata8"),
    @XmlEnumValue("Metadata9")
    METADATA_9("Metadata9");
    private final String value;

    EnumPartIDKeys(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPartIDKeys fromValue(String v) {
        for (EnumPartIDKeys c: EnumPartIDKeys.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
