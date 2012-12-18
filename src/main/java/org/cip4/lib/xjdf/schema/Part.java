
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Metadata1" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="FountainNumber" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PageTags" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="Metadata2" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata0" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata5" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata6" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata3" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="CellIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="Metadata4" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata9" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Metadata7" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="Edition" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Metadata8" type="{http://www.CIP4.org/JDFSchema_2_0}NameRangeList" />
 *       &lt;attribute name="ItemNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="RunIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="BundleItemIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="LayerIDs" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="WebProduct" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="WebName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Location" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Separation" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BinderySignatureName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="DeliveryUnit5" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DeliveryUnit4" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="EditionVersion" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="DeliveryUnit7" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DeliveryUnit6" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="Run" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="DocRunIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="DeliveryUnit1" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DeliveryUnit0" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DeliveryUnit3" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="PreflightRule" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SheetName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SubRun" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DeliveryUnit2" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="SetTags" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="SetSheetIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="RunPage" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PartVersion" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="SetRunIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SignatureName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TileID" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="DocCopies" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="DocTags" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="BlockName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="DeliveryUnit9" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="DocSheetIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="DeliveryUnit8" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="SetDocIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SetIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="PlateLayout" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="RibbonName" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="PageNumber" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="RunSet" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="StationName" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="PreviewType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RunPageRange" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="WebSetup" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Side" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="DocIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="SectionIndex" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="RunTags" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Option" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="BinderySignaturePaginationIndex" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="Condition" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Part")
public class Part
    implements Serializable
{

    @XmlAttribute(name = "Metadata1")
    protected String metadata1;
    @XmlAttribute(name = "FountainNumber")
    protected Integer fountainNumber;
    @XmlAttribute(name = "PageTags")
    protected String pageTags;
    @XmlAttribute(name = "Metadata2")
    protected String metadata2;
    @XmlAttribute(name = "Metadata0")
    protected String metadata0;
    @XmlAttribute(name = "Metadata5")
    protected String metadata5;
    @XmlAttribute(name = "Metadata6")
    protected String metadata6;
    @XmlAttribute(name = "Metadata3")
    protected String metadata3;
    @XmlAttribute(name = "CellIndex")
    protected Integer cellIndex;
    @XmlAttribute(name = "Metadata4")
    protected String metadata4;
    @XmlAttribute(name = "Metadata9")
    protected String metadata9;
    @XmlAttribute(name = "Metadata7")
    protected String metadata7;
    @XmlAttribute(name = "Edition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String edition;
    @XmlAttribute(name = "Metadata8")
    protected String metadata8;
    @XmlAttribute(name = "ItemNames")
    protected List<String> itemNames;
    @XmlAttribute(name = "RunIndex")
    protected Integer runIndex;
    @XmlAttribute(name = "BundleItemIndex")
    protected Integer bundleItemIndex;
    @XmlAttribute(name = "LayerIDs")
    protected Integer layerIDs;
    @XmlAttribute(name = "WebProduct")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String webProduct;
    @XmlAttribute(name = "WebName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String webName;
    @XmlAttribute(name = "Location")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String location;
    @XmlAttribute(name = "Separation")
    protected String separation;
    @XmlAttribute(name = "BinderySignatureName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String binderySignatureName;
    @XmlAttribute(name = "DeliveryUnit5")
    protected String deliveryUnit5;
    @XmlAttribute(name = "DeliveryUnit4")
    protected String deliveryUnit4;
    @XmlAttribute(name = "EditionVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String editionVersion;
    @XmlAttribute(name = "DeliveryUnit7")
    protected String deliveryUnit7;
    @XmlAttribute(name = "DeliveryUnit6")
    protected String deliveryUnit6;
    @XmlAttribute(name = "Run")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String run;
    @XmlAttribute(name = "DocRunIndex")
    protected Integer docRunIndex;
    @XmlAttribute(name = "DeliveryUnit1")
    protected String deliveryUnit1;
    @XmlAttribute(name = "DeliveryUnit0")
    protected String deliveryUnit0;
    @XmlAttribute(name = "DeliveryUnit3")
    protected String deliveryUnit3;
    @XmlAttribute(name = "PreflightRule")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preflightRule;
    @XmlAttribute(name = "SheetName")
    protected String sheetName;
    @XmlAttribute(name = "SubRun")
    protected String subRun;
    @XmlAttribute(name = "DeliveryUnit2")
    protected String deliveryUnit2;
    @XmlAttribute(name = "SetTags")
    protected String setTags;
    @XmlAttribute(name = "SetSheetIndex")
    protected Integer setSheetIndex;
    @XmlAttribute(name = "RunPage")
    protected Integer runPage;
    @XmlAttribute(name = "PartVersion")
    protected List<String> partVersion;
    @XmlAttribute(name = "SetRunIndex")
    protected Integer setRunIndex;
    @XmlAttribute(name = "SignatureName")
    protected String signatureName;
    @XmlAttribute(name = "TileID")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair tileID;
    @XmlAttribute(name = "DocCopies")
    protected Integer docCopies;
    @XmlAttribute(name = "DocTags")
    protected String docTags;
    @XmlAttribute(name = "BlockName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String blockName;
    @XmlAttribute(name = "DeliveryUnit9")
    protected String deliveryUnit9;
    @XmlAttribute(name = "DocSheetIndex")
    protected Integer docSheetIndex;
    @XmlAttribute(name = "DeliveryUnit8")
    protected String deliveryUnit8;
    @XmlAttribute(name = "SetDocIndex")
    protected Integer setDocIndex;
    @XmlAttribute(name = "SetIndex")
    protected Integer setIndex;
    @XmlAttribute(name = "PlateLayout")
    protected String plateLayout;
    @XmlAttribute(name = "RibbonName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ribbonName;
    @XmlAttribute(name = "PageNumber")
    protected Integer pageNumber;
    @XmlAttribute(name = "RunSet")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String runSet;
    @XmlAttribute(name = "StationName")
    protected String stationName;
    @XmlAttribute(name = "PreviewType")
    @XmlSchemaType(name = "anySimpleType")
    protected String previewType;
    @XmlAttribute(name = "RunPageRange")
    protected String runPageRange;
    @XmlAttribute(name = "WebSetup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String webSetup;
    @XmlAttribute(name = "Side")
    @XmlSchemaType(name = "anySimpleType")
    protected String side;
    @XmlAttribute(name = "SheetIndex")
    protected Integer sheetIndex;
    @XmlAttribute(name = "DocIndex")
    protected Integer docIndex;
    @XmlAttribute(name = "SectionIndex")
    protected Integer sectionIndex;
    @XmlAttribute(name = "RunTags")
    protected List<String> runTags;
    @XmlAttribute(name = "Option")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String option;
    @XmlAttribute(name = "BinderySignaturePaginationIndex")
    protected String binderySignaturePaginationIndex;
    @XmlAttribute(name = "Condition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String condition;

    /**
     * Gets the value of the metadata1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata1() {
        return metadata1;
    }

    /**
     * Sets the value of the metadata1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata1(String value) {
        this.metadata1 = value;
    }

    /**
     * Gets the value of the fountainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFountainNumber() {
        return fountainNumber;
    }

    /**
     * Sets the value of the fountainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFountainNumber(Integer value) {
        this.fountainNumber = value;
    }

    /**
     * Gets the value of the pageTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageTags() {
        return pageTags;
    }

    /**
     * Sets the value of the pageTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageTags(String value) {
        this.pageTags = value;
    }

    /**
     * Gets the value of the metadata2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata2() {
        return metadata2;
    }

    /**
     * Sets the value of the metadata2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata2(String value) {
        this.metadata2 = value;
    }

    /**
     * Gets the value of the metadata0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata0() {
        return metadata0;
    }

    /**
     * Sets the value of the metadata0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata0(String value) {
        this.metadata0 = value;
    }

    /**
     * Gets the value of the metadata5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata5() {
        return metadata5;
    }

    /**
     * Sets the value of the metadata5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata5(String value) {
        this.metadata5 = value;
    }

    /**
     * Gets the value of the metadata6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata6() {
        return metadata6;
    }

    /**
     * Sets the value of the metadata6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata6(String value) {
        this.metadata6 = value;
    }

    /**
     * Gets the value of the metadata3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata3() {
        return metadata3;
    }

    /**
     * Sets the value of the metadata3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata3(String value) {
        this.metadata3 = value;
    }

    /**
     * Gets the value of the cellIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellIndex() {
        return cellIndex;
    }

    /**
     * Sets the value of the cellIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellIndex(Integer value) {
        this.cellIndex = value;
    }

    /**
     * Gets the value of the metadata4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata4() {
        return metadata4;
    }

    /**
     * Sets the value of the metadata4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata4(String value) {
        this.metadata4 = value;
    }

    /**
     * Gets the value of the metadata9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata9() {
        return metadata9;
    }

    /**
     * Sets the value of the metadata9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata9(String value) {
        this.metadata9 = value;
    }

    /**
     * Gets the value of the metadata7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata7() {
        return metadata7;
    }

    /**
     * Sets the value of the metadata7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata7(String value) {
        this.metadata7 = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the metadata8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata8() {
        return metadata8;
    }

    /**
     * Sets the value of the metadata8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata8(String value) {
        this.metadata8 = value;
    }

    /**
     * Gets the value of the itemNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemNames() {
        if (itemNames == null) {
            itemNames = new ArrayList<String>();
        }
        return this.itemNames;
    }

    /**
     * Gets the value of the runIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunIndex() {
        return runIndex;
    }

    /**
     * Sets the value of the runIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunIndex(Integer value) {
        this.runIndex = value;
    }

    /**
     * Gets the value of the bundleItemIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBundleItemIndex() {
        return bundleItemIndex;
    }

    /**
     * Sets the value of the bundleItemIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBundleItemIndex(Integer value) {
        this.bundleItemIndex = value;
    }

    /**
     * Gets the value of the layerIDs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayerIDs() {
        return layerIDs;
    }

    /**
     * Sets the value of the layerIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayerIDs(Integer value) {
        this.layerIDs = value;
    }

    /**
     * Gets the value of the webProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebProduct() {
        return webProduct;
    }

    /**
     * Sets the value of the webProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebProduct(String value) {
        this.webProduct = value;
    }

    /**
     * Gets the value of the webName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebName() {
        return webName;
    }

    /**
     * Sets the value of the webName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebName(String value) {
        this.webName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparation(String value) {
        this.separation = value;
    }

    /**
     * Gets the value of the binderySignatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderySignatureName() {
        return binderySignatureName;
    }

    /**
     * Sets the value of the binderySignatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderySignatureName(String value) {
        this.binderySignatureName = value;
    }

    /**
     * Gets the value of the deliveryUnit5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit5() {
        return deliveryUnit5;
    }

    /**
     * Sets the value of the deliveryUnit5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit5(String value) {
        this.deliveryUnit5 = value;
    }

    /**
     * Gets the value of the deliveryUnit4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit4() {
        return deliveryUnit4;
    }

    /**
     * Sets the value of the deliveryUnit4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit4(String value) {
        this.deliveryUnit4 = value;
    }

    /**
     * Gets the value of the editionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditionVersion() {
        return editionVersion;
    }

    /**
     * Sets the value of the editionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditionVersion(String value) {
        this.editionVersion = value;
    }

    /**
     * Gets the value of the deliveryUnit7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit7() {
        return deliveryUnit7;
    }

    /**
     * Sets the value of the deliveryUnit7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit7(String value) {
        this.deliveryUnit7 = value;
    }

    /**
     * Gets the value of the deliveryUnit6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit6() {
        return deliveryUnit6;
    }

    /**
     * Sets the value of the deliveryUnit6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit6(String value) {
        this.deliveryUnit6 = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

    /**
     * Gets the value of the docRunIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocRunIndex() {
        return docRunIndex;
    }

    /**
     * Sets the value of the docRunIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocRunIndex(Integer value) {
        this.docRunIndex = value;
    }

    /**
     * Gets the value of the deliveryUnit1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit1() {
        return deliveryUnit1;
    }

    /**
     * Sets the value of the deliveryUnit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit1(String value) {
        this.deliveryUnit1 = value;
    }

    /**
     * Gets the value of the deliveryUnit0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit0() {
        return deliveryUnit0;
    }

    /**
     * Sets the value of the deliveryUnit0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit0(String value) {
        this.deliveryUnit0 = value;
    }

    /**
     * Gets the value of the deliveryUnit3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit3() {
        return deliveryUnit3;
    }

    /**
     * Sets the value of the deliveryUnit3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit3(String value) {
        this.deliveryUnit3 = value;
    }

    /**
     * Gets the value of the preflightRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreflightRule() {
        return preflightRule;
    }

    /**
     * Sets the value of the preflightRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreflightRule(String value) {
        this.preflightRule = value;
    }

    /**
     * Gets the value of the sheetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetName() {
        return sheetName;
    }

    /**
     * Sets the value of the sheetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetName(String value) {
        this.sheetName = value;
    }

    /**
     * Gets the value of the subRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRun() {
        return subRun;
    }

    /**
     * Sets the value of the subRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRun(String value) {
        this.subRun = value;
    }

    /**
     * Gets the value of the deliveryUnit2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit2() {
        return deliveryUnit2;
    }

    /**
     * Sets the value of the deliveryUnit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit2(String value) {
        this.deliveryUnit2 = value;
    }

    /**
     * Gets the value of the setTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetTags() {
        return setTags;
    }

    /**
     * Sets the value of the setTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetTags(String value) {
        this.setTags = value;
    }

    /**
     * Gets the value of the setSheetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetSheetIndex() {
        return setSheetIndex;
    }

    /**
     * Sets the value of the setSheetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetSheetIndex(Integer value) {
        this.setSheetIndex = value;
    }

    /**
     * Gets the value of the runPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunPage() {
        return runPage;
    }

    /**
     * Sets the value of the runPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunPage(Integer value) {
        this.runPage = value;
    }

    /**
     * Gets the value of the partVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartVersion() {
        if (partVersion == null) {
            partVersion = new ArrayList<String>();
        }
        return this.partVersion;
    }

    /**
     * Gets the value of the setRunIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetRunIndex() {
        return setRunIndex;
    }

    /**
     * Sets the value of the setRunIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetRunIndex(Integer value) {
        this.setRunIndex = value;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the tileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getTileID() {
        return tileID;
    }

    /**
     * Sets the value of the tileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTileID(org.cip4.lib.xjdf.type.XYPair value) {
        this.tileID = value;
    }

    /**
     * Gets the value of the docCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocCopies() {
        return docCopies;
    }

    /**
     * Sets the value of the docCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocCopies(Integer value) {
        this.docCopies = value;
    }

    /**
     * Gets the value of the docTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTags() {
        return docTags;
    }

    /**
     * Sets the value of the docTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTags(String value) {
        this.docTags = value;
    }

    /**
     * Gets the value of the blockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * Sets the value of the blockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockName(String value) {
        this.blockName = value;
    }

    /**
     * Gets the value of the deliveryUnit9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit9() {
        return deliveryUnit9;
    }

    /**
     * Sets the value of the deliveryUnit9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit9(String value) {
        this.deliveryUnit9 = value;
    }

    /**
     * Gets the value of the docSheetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocSheetIndex() {
        return docSheetIndex;
    }

    /**
     * Sets the value of the docSheetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocSheetIndex(Integer value) {
        this.docSheetIndex = value;
    }

    /**
     * Gets the value of the deliveryUnit8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUnit8() {
        return deliveryUnit8;
    }

    /**
     * Sets the value of the deliveryUnit8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUnit8(String value) {
        this.deliveryUnit8 = value;
    }

    /**
     * Gets the value of the setDocIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetDocIndex() {
        return setDocIndex;
    }

    /**
     * Sets the value of the setDocIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetDocIndex(Integer value) {
        this.setDocIndex = value;
    }

    /**
     * Gets the value of the setIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetIndex() {
        return setIndex;
    }

    /**
     * Sets the value of the setIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetIndex(Integer value) {
        this.setIndex = value;
    }

    /**
     * Gets the value of the plateLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateLayout() {
        return plateLayout;
    }

    /**
     * Sets the value of the plateLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateLayout(String value) {
        this.plateLayout = value;
    }

    /**
     * Gets the value of the ribbonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRibbonName() {
        return ribbonName;
    }

    /**
     * Sets the value of the ribbonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRibbonName(String value) {
        this.ribbonName = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the runSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunSet() {
        return runSet;
    }

    /**
     * Sets the value of the runSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunSet(String value) {
        this.runSet = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the previewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewType() {
        return previewType;
    }

    /**
     * Sets the value of the previewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewType(String value) {
        this.previewType = value;
    }

    /**
     * Gets the value of the runPageRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunPageRange() {
        return runPageRange;
    }

    /**
     * Sets the value of the runPageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunPageRange(String value) {
        this.runPageRange = value;
    }

    /**
     * Gets the value of the webSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSetup() {
        return webSetup;
    }

    /**
     * Sets the value of the webSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSetup(String value) {
        this.webSetup = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the sheetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSheetIndex() {
        return sheetIndex;
    }

    /**
     * Sets the value of the sheetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSheetIndex(Integer value) {
        this.sheetIndex = value;
    }

    /**
     * Gets the value of the docIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocIndex() {
        return docIndex;
    }

    /**
     * Sets the value of the docIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocIndex(Integer value) {
        this.docIndex = value;
    }

    /**
     * Gets the value of the sectionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionIndex() {
        return sectionIndex;
    }

    /**
     * Sets the value of the sectionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionIndex(Integer value) {
        this.sectionIndex = value;
    }

    /**
     * Gets the value of the runTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRunTags() {
        if (runTags == null) {
            runTags = new ArrayList<String>();
        }
        return this.runTags;
    }

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Gets the value of the binderySignaturePaginationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderySignaturePaginationIndex() {
        return binderySignaturePaginationIndex;
    }

    /**
     * Sets the value of the binderySignaturePaginationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderySignaturePaginationIndex(String value) {
        this.binderySignaturePaginationIndex = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
