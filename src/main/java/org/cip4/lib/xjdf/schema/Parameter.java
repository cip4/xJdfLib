
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ParameterType" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}AmountPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GeneralID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Locked" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PipeURL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PipeProtocol" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="Status" type="{http://www.CIP4.org/JDFSchema_2_0}EnumResStatus" />
 *       &lt;attribute name="PipeID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="AgentVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="ID" type="{http://www.CIP4.org/JDFSchema_2_0}ID" />
 *       &lt;attribute name="NoOp" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PartUsage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ProductID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Author" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="PipePartIDKeys">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPartIDKeys" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="QualityControlResultRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SourceResourceRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="DescriptiveName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "part",
    "parameterType",
    "amountPool",
    "generalID",
    "comment"
})
@XmlRootElement(name = "Parameter")
public class Parameter
    implements Serializable
{

    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElementRef(name = "ParameterType", namespace = "http://www.CIP4.org/JDFSchema_2_0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParameterType> parameterType;
    @XmlElement(name = "AmountPool")
    protected List<AmountPool> amountPool;
    @XmlElement(name = "GeneralID")
    protected List<GeneralID> generalID;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "PipeURL")
    protected String pipeURL;
    @XmlAttribute(name = "Class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "PartIDKeys")
    protected List<EnumPartIDKeys> partIDKeys;
    @XmlAttribute(name = "PipeProtocol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pipeProtocol;
    @XmlAttribute(name = "Status")
    protected EnumResStatus status;
    @XmlAttribute(name = "PipeID")
    protected String pipeID;
    @XmlAttribute(name = "AgentName")
    protected String agentName;
    @XmlAttribute(name = "AgentVersion")
    protected String agentVersion;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "NoOp")
    protected Boolean noOp;
    @XmlAttribute(name = "PartUsage")
    @XmlSchemaType(name = "anySimpleType")
    protected String partUsage;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "PipePartIDKeys")
    protected List<EnumPartIDKeys> pipePartIDKeys;
    @XmlAttribute(name = "QualityControlResultRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF qualityControlResultRef;
    @XmlAttribute(name = "SourceResourceRefs")
    @XmlIDREF
    protected List<Object> sourceResourceRefs;
    @XmlAttribute(name = "DescriptiveName")
    protected String descriptiveName;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndSheetGluingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FitPolicy }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApprovalSuccess }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferFunctionControl }{@code >}
     *     {@link JAXBElement }{@code <}{@link BarcodeReproParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobField }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorantAlias }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preview }{@code >}
     *     {@link JAXBElement }{@code <}{@link WebInlineFinishingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageCompressionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorSpaceConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightAnalysis }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link SideSewingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link WrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InkZoneProfile }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireCombBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BarcodeCompParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageSetterParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDLCreationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdhesiveBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutBlock }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityControlResult }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrintCondition }{@code >}
     *     {@link JAXBElement }{@code <}{@link DividingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmbossingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link GluingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBRules }{@code >}
     *     {@link JAXBElement }{@code <}{@link Layout }{@code >}
     *     {@link JAXBElement }{@code <}{@link DigitalPrintingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link LabelingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenderingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationField }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBSelection }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DigitalDeliveryParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeliveryParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightProfile }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Shape }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeparationControlParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InsertSheet }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrintRollingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreadSealingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShrinkingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeviceNSpace }{@code >}
     *     {@link JAXBElement }{@code <}{@link DieLayoutProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FoldingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaseMakingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDLResourceAlias }{@code >}
     *     {@link JAXBElement }{@code <}{@link LongitudinalRibbonOperationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManualLaborParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CasingInParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaminatingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FileSpec }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeDef }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpineTapingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InkZoneCalculationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadBandApplicationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxFoldingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InsertingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderLayout }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunList }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefAnchor }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreadSewingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityControlParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeDefProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CIELABMeasuringField }{@code >}
     *     {@link JAXBElement }{@code <}{@link Hole }{@code >}
     *     {@link JAXBElement }{@code <}{@link BendingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoilBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObjectResolution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlueApplication }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContentList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductionPath }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreasingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourceDefinitionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link AutomatedOverPrintParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBSchema }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssetListCreationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DensityMeasuringField }{@code >}
     *     {@link JAXBElement }{@code <}{@link StackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrimmingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScreeningParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleList }{@code >}
     *     {@link JAXBElement }{@code <}{@link PageList }{@code >}
     *     {@link JAXBElement }{@code <}{@link PSToPDFConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CuttingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreviewGenerationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageReplacementParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FontPolicy }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrapRegion }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightReportRulePool }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElementColorParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightInventory }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaddleStitchingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediaSource }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrappingDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDFToPSConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComChannel }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpretingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBMergeParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlateCopyParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApprovalParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutShift }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarnishingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleMakingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PalletizingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link StitchingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorControlStrip }{@code >}
     *     {@link JAXBElement }{@code <}{@link ByteMap }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxPackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Tile }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DieLayout }{@code >}
     *     {@link JAXBElement }{@code <}{@link Trigger }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorantControl }{@code >}
     *     {@link JAXBElement }{@code <}{@link Assembly }{@code >}
     *     {@link JAXBElement }{@code <}{@link FontParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BufferParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderLayoutPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Media }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinderySignature }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScavengerArea }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeCuttingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChannelBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalPrintingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactCopyParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorMeasurementConditions }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpinePreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FoldOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferCurvePool }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutElementProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link NodeInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScanParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferCurve }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlueLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link StripBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link GatheringParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BundlingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpretedPDLData }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlasticCombBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link JacketingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalImpositionTemplate }{@code >}
     *     {@link JAXBElement }{@code <}{@link PerforatingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeviceMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorCorrectionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoverApplicationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProofingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerificationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fold }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightReport }{@code >}
     *     
     */
    public JAXBElement<? extends ParameterType> getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndSheetGluingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FitPolicy }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApprovalSuccess }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferFunctionControl }{@code >}
     *     {@link JAXBElement }{@code <}{@link BarcodeReproParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link JobField }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorantAlias }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preview }{@code >}
     *     {@link JAXBElement }{@code <}{@link WebInlineFinishingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageCompressionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorSpaceConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightAnalysis }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link SideSewingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link WrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InkZoneProfile }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireCombBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BarcodeCompParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageSetterParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDLCreationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdhesiveBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CutBlock }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityControlResult }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrintCondition }{@code >}
     *     {@link JAXBElement }{@code <}{@link DividingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmbossingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link GluingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBRules }{@code >}
     *     {@link JAXBElement }{@code <}{@link Layout }{@code >}
     *     {@link JAXBElement }{@code <}{@link DigitalPrintingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link LabelingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenderingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentificationField }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBSelection }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DigitalDeliveryParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeliveryParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightProfile }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Shape }{@code >}
     *     {@link JAXBElement }{@code <}{@link StrappingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeparationControlParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InsertSheet }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrintRollingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreadSealingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShrinkingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeviceNSpace }{@code >}
     *     {@link JAXBElement }{@code <}{@link DieLayoutProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FoldingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaseMakingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDLResourceAlias }{@code >}
     *     {@link JAXBElement }{@code <}{@link LongitudinalRibbonOperationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManualLaborParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CasingInParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaminatingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FileSpec }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeDef }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpineTapingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InkZoneCalculationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadBandApplicationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxFoldingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InsertingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderLayout }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunList }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefAnchor }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreadSewingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityControlParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeDefProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CIELABMeasuringField }{@code >}
     *     {@link JAXBElement }{@code <}{@link Hole }{@code >}
     *     {@link JAXBElement }{@code <}{@link BendingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoilBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObjectResolution }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlueApplication }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContentList }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductionPath }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreasingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResourceDefinitionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link AutomatedOverPrintParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBSchema }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssetListCreationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DensityMeasuringField }{@code >}
     *     {@link JAXBElement }{@code <}{@link StackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrimmingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScreeningParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleList }{@code >}
     *     {@link JAXBElement }{@code <}{@link PageList }{@code >}
     *     {@link JAXBElement }{@code <}{@link PSToPDFConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CuttingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreviewGenerationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageReplacementParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FontPolicy }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrapRegion }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightReportRulePool }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElementColorParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightInventory }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaddleStitchingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediaSource }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrappingDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link PDFToPSConversionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComChannel }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpretingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DBMergeParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlateCopyParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApprovalParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutShift }{@code >}
     *     {@link JAXBElement }{@code <}{@link VarnishingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleMakingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link PalletizingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link StitchingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorControlStrip }{@code >}
     *     {@link JAXBElement }{@code <}{@link ByteMap }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxPackingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Tile }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DieLayout }{@code >}
     *     {@link JAXBElement }{@code <}{@link Trigger }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorantControl }{@code >}
     *     {@link JAXBElement }{@code <}{@link Assembly }{@code >}
     *     {@link JAXBElement }{@code <}{@link FontParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BufferParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CylinderLayoutPreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Media }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinderySignature }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScavengerArea }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeCuttingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoleLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChannelBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalPrintingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContactCopyParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorMeasurementConditions }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpinePreparationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link FoldOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferCurvePool }{@code >}
     *     {@link JAXBElement }{@code <}{@link LayoutElementProductionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link NodeInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScanParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferCurve }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlueLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link StripBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link GatheringParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link BundlingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterpretedPDLData }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlasticCombBindingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link JacketingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExternalImpositionTemplate }{@code >}
     *     {@link JAXBElement }{@code <}{@link PerforatingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeviceMark }{@code >}
     *     {@link JAXBElement }{@code <}{@link ColorCorrectionParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoverApplicationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProofingParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerificationParams }{@code >}
     *     {@link JAXBElement }{@code <}{@link Fold }{@code >}
     *     {@link JAXBElement }{@code <}{@link PreflightReport }{@code >}
     *     
     */
    public void setParameterType(JAXBElement<? extends ParameterType> value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the amountPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountPool }
     * 
     * 
     */
    public List<AmountPool> getAmountPool() {
        if (amountPool == null) {
            amountPool = new ArrayList<AmountPool>();
        }
        return this.amountPool;
    }

    /**
     * Gets the value of the generalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralID }
     * 
     * 
     */
    public List<GeneralID> getGeneralID() {
        if (generalID == null) {
            generalID = new ArrayList<GeneralID>();
        }
        return this.generalID;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the pipeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeURL() {
        return pipeURL;
    }

    /**
     * Sets the value of the pipeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeURL(String value) {
        this.pipeURL = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the partIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPartIDKeys() {
        if (partIDKeys == null) {
            partIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.partIDKeys;
    }

    /**
     * Gets the value of the pipeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeProtocol() {
        return pipeProtocol;
    }

    /**
     * Sets the value of the pipeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeProtocol(String value) {
        this.pipeProtocol = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumResStatus }
     *     
     */
    public EnumResStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumResStatus }
     *     
     */
    public void setStatus(EnumResStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the pipeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeID() {
        return pipeID;
    }

    /**
     * Sets the value of the pipeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeID(String value) {
        this.pipeID = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the agentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * Sets the value of the agentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentVersion(String value) {
        this.agentVersion = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the noOp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoOp() {
        return noOp;
    }

    /**
     * Sets the value of the noOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoOp(Boolean value) {
        this.noOp = value;
    }

    /**
     * Gets the value of the partUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartUsage() {
        return partUsage;
    }

    /**
     * Sets the value of the partUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartUsage(String value) {
        this.partUsage = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the pipePartIDKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipePartIDKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipePartIDKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPartIDKeys }
     * 
     * 
     */
    public List<EnumPartIDKeys> getPipePartIDKeys() {
        if (pipePartIDKeys == null) {
            pipePartIDKeys = new ArrayList<EnumPartIDKeys>();
        }
        return this.pipePartIDKeys;
    }

    /**
     * Gets the value of the qualityControlResultRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getQualityControlResultRef() {
        return qualityControlResultRef;
    }

    /**
     * Sets the value of the qualityControlResultRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityControlResultRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.qualityControlResultRef = value;
    }

    /**
     * Gets the value of the sourceResourceRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceResourceRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceResourceRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSourceResourceRefs() {
        if (sourceResourceRefs == null) {
            sourceResourceRefs = new ArrayList<Object>();
        }
        return this.sourceResourceRefs;
    }

    /**
     * Gets the value of the descriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
    }

}
