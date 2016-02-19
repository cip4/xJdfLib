package org.cip4.lib.xjdf;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.type.Matrix;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.type.XYPair;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Static Factory Class which is managing the creation of XJdfNodes.
 */
public class XJdfNodeFactory extends ObjectFactory {

    /**
     * Default constructor.
     */
    public XJdfNodeFactory() {
        // no action
    }

    /**
     * Create a new Parameter node from ParameterType
     *
     * @param parameterType The ParameterType Node
     *
     * @return New Parameter node from ParametType node.
     */
    public Parameter createParameter(ParameterType parameterType) {

        return createParameter(parameterType, null);
    }

    /**
     * Create a new Parameter node from ParameterType and Part
     *
     * @param parameterType The ParameterType Node
     * @param part The Part Node
     *
     * @return New Parameter node from ParametType and Part node.
     */
    public Parameter createParameter(ParameterType parameterType, Part part) {

        if (parameterType == null)
            return null;

        // get parameter name
        String paramName = parameterType.getClass().getSimpleName();

        // create parameter
        Parameter parameter = super.createParameter();

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement obj = new JAXBElement(qname, parameterType.getClass(), null, parameterType);
        parameter.setParameterType(obj);

        if (part != null) {
            parameter.getPart().add(part);
        }

        // return node
        return parameter;
    }

    /**
     * Create a new Resource node from ResourceType and Part
     *
     * @param resourceType The ResourceType Node
     * @param part The Part Node
     *
     * @return New Resource node from ResourceType and Part node.
     */
    public Resource createResource(ResourceType resourceType, Part part) {

        if (resourceType == null)
            return null;

        // get resource name
        String paramName = resourceType.getClass().getSimpleName();

        // create resource
        Resource resource = super.createResource();

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement obj = new JAXBElement(qname, resourceType.getClass(), null, resourceType);
        resource.setResourceType(obj);

        if (part != null) {
            resource.withPart(part);
        }

        // return node
        return resource;
    }

    /**
     * Create a new pre-filled GeneralID Node.
     *
     * @param idUsage Value of node attribute 'IDUsage'.
     * @param idValue Value of node attribute 'IDValue'.
     *
     * @return Pre-filled GeneralID object.
     */
    public GeneralID createGeneralID(String idUsage, String idValue) {

        // create new GeneralID object
        GeneralID generalId = createGeneralID();
        generalId.setIDUsage(idUsage);
        generalId.setIDValue(idValue);

        // return GeneralID
        return generalId;
    }

    /**
     * Create a new RunList Node which already contains a FileSpec URL definition.
     *
     * @param fileSpecUrl URL attribute in element FileSpec.
     *
     * @return RunList Node which already contains a FileSpec URL definition.
     */
    public RunList createRunList(String fileSpecUrl) {

        // create RunList Node
        RunList runList = super.createRunList();

        // extend by FileSpec element
        FileSpec fileSpec = createFileSpec();
        fileSpec.setURL(fileSpecUrl);
        runList.setFileSpec(fileSpec);

        // return runList
        return runList;
    }

    /**
     * Create a new CuttingParams Node which already contains a FileSpec URL definition.
     *
     * @param fileSpecUrl URL attribute in sub element FileSpec.
     *
     * @return CuttingParams Node which already contains a FileSpec URL definition.
     */
    public CuttingParams createCuttingParams(String fileSpecUrl) {

        // create CuttingParams Node
        CuttingParams cuttingParams = super.createCuttingParams();

        // extend by FileSpec element
        FileSpec fileSpec = createFileSpec();
        fileSpec.setURL(fileSpecUrl);
        cuttingParams.setFileSpec(fileSpec);

        // return cuttingParams
        return cuttingParams;
    }

    /**
     * Create a new Comment Node which already contains a comment string as text.
     *
     * @param comment Comment Node text value.
     *
     * @return Comment Node which already contains a comment string as text.
     */
    public Comment createComment(String comment) {

        // create Comment Node
        Comment obj = super.createComment();

        // set attribute
        obj.setValue(comment);

        // return object
        return obj;
    }

    /**
     * Create a new ApprovalParams Node which already contains values for attributes MinApprovals
     *
     * @param minApprovals Value for MinApprovals attribute.
     *
     * @return ApprovalParams Node which already contains defined attributes.
     */
    public ApprovalParams createApprovalParams(int minApprovals) {

        // create node
        ApprovalParams approvalParams = super.createApprovalParams();

        // set attributes
        approvalParams.setMinApprovals(minApprovals);

        // return object
        return approvalParams;
    }

    /**
     * Create a new CustomerInfo Node which already contains values for attribute CustomerID
     *
     * @param customerID Value for CustomerID attribute.
     *
     * @return CustomerInfo Node which already contains defined attributes.
     */
    public CustomerInfo createCustomerInfo(String customerID) {

        return createCustomerInfo(customerID, null);
    }

    /**
     * Create a new CustomerInfo Node which already contains values for attribute CustomerID
     *
     * @param customerID Value for CustomerID attribute.
     * @param customerOrderID Value for CustomerOrderID attribute.
     *
     * @return CustomerInfo Node which already contains defined attributes.
     */
    public CustomerInfo createCustomerInfo(String customerID, String customerOrderID) {

        // create node
        CustomerInfo customerInfo = super.createCustomerInfo();

        // set attributes
        customerInfo.setCustomerID(customerID);
        customerInfo.setCustomerOrderID(customerOrderID);

        // return object
        return customerInfo;
    }

    /**
     * Create a new NodeInfo Node which already contains values for attributes TotalDuration.
     *
     * @param totalDuration Value for NodeInfo attribute.
     *
     * @return NodeInfo Node which already contains defined attributes.
     */
    public NodeInfo createNodeInfo(Duration totalDuration) {

        // create node
        NodeInfo nodeInfo = super.createNodeInfo();

        // set attributes
        nodeInfo.setTotalDuration(totalDuration);

        // return object
        return nodeInfo;
    }

    /**
     * Create a new NodeInfo Node which already contains values for attributes JobPriority.
     *
     * @return NodeInfo Node which already contains defined attributes.
     */
    public NodeInfo createNodeInfo(Integer jobPriority) {

        // create node
        NodeInfo nodeInfo = super.createNodeInfo();

        // set attributes
        nodeInfo.setJobPriority(jobPriority);

        // return object
        return nodeInfo;
    }

    /**
     * Create a new NodeInfo Node which already contains values for attributes End.
     *
     * @param end Value for End attribute.
     *
     * @return NodeInfo Node which already contains defined attributes.
     */
    public NodeInfo createNodeInfo(DateTime end) {

        // create node
        NodeInfo nodeInfo = super.createNodeInfo();

        // set attributes
        nodeInfo.setEnd(end);

        // return object
        return nodeInfo;
    }

    /**
     * Create a new NodeInfo Node which already contains values for attributes TotalDuration, End and NaturalLang.
     *
     * @param totalDuration Value for NodeInfo attribute.
     * @param end Value for End attribute.
     * @param naturalLang Value for NaturalLang attribute.
     *
     * @return NodeInfo Node which already contains defined attributes.
     */
    public NodeInfo createNodeInfo(Duration totalDuration, DateTime end, String naturalLang) {

        // create node
        NodeInfo nodeInfo = super.createNodeInfo();

        // set attributes
        nodeInfo.setTotalDuration(totalDuration);
        nodeInfo.setEnd(end);
        nodeInfo.setNaturalLang(naturalLang);

        // return object
        return nodeInfo;
    }

    /**
     * Create a new Preview Node which already contains a value for attribute URL.
     *
     * @param URL Value for URL attribute.
     *
     * @return Preview Node which already contains defined attributes.
     */
    public Preview createPreview(String URL) {

        return createPreview(URL, null);
    }

    /**
     * Create a new Preview Node which already contains values for attributes PreviewUsage, URL and PreviewFileType.
     *
     * @param url Value for URL attribute.
     * @param previewFileType Value for PreviewFileType attribute.
     *
     * @return Preview Node which already contains defined attributes.
     */
    public Preview createPreview(final String url, final String previewFileType) {
        Preview preview = super.createPreview();

        preview.setFileSpec(
            new FileSpec()
                .withURL(url)
        );
        preview.setPreviewFileType(previewFileType);

        return preview;
    }

    /**
     * Create new MediaIntent Node which already contains values for attribute MediaQuality.
     *
     * @param mediaQuality Value for MediaQuality attribute.
     *
     * @return MediaIntent Node which already contains defined attributes.
     */
    public MediaIntent createMediaIntent(String mediaQuality) {

        // return object
        return createMediaIntent(mediaQuality, null, null);
    }

    /**
     * Create new MediaIntent Node which already contains values for attributes MediaQuality, StockBrand and Weight.
     *
     * @param mediaQuality Value for MediaQuality attribute.
     * @param stockBrand Value for StockBrand attribute.
     * @param weight Value for Weight attribute.
     *
     * @return MediaIntent Node which already contains defined attributes.
     */
    public MediaIntent createMediaIntent(String mediaQuality, String stockBrand, Double weight) {

        // create node
        MediaIntent mediaIntent = super.createMediaIntent();

        // set attributes
        mediaIntent.setMediaQuality(mediaQuality);
        mediaIntent.setStockBrand(stockBrand);
        mediaIntent.setWeight(weight);

        // return object
        return mediaIntent;
    }

    /**
     * Create new LayoutIntent Node which already contains values for attribute Pages.
     *
     * @param pages Value for Pages attribute.
     *
     * @return LayoutIntent Node which already contains defined attributes.
     */
    public LayoutIntent createLayoutIntent(Integer pages) {

        // return object
        return createLayoutIntent(pages, null, null, null);
    }

    /**
     * Create new LayoutIntent Node which already contains values for attributes Pages, Sides, FinishedDimensions and
     * Dimensions.
     *
     * @param pages Value for Pages attribute.
     * @param sides Value for Sides attribute.
     * @param finishedDimensions Value for FinishedDimensions attribute.
     *
     * @return LayoutIntent Node which already contains defined attributes.
     */
    public LayoutIntent createLayoutIntent(Integer pages, String sides, Shape finishedDimensions) {

        // return object
        return createLayoutIntent(pages, sides, finishedDimensions, null);
    }

    /**
     * Create new LayoutIntent Node which already contains values for attributes Pages, Sides, FinishedDimensions and
     * Dimensions.
     *
     * @param pages Value for Pages attribute.
     * @param sides Value for Sides attribute.
     * @param finishedDimensions Value for FinishedDimensions attribute.
     * @param dimensions Value for Dimensions attribute.
     *
     * @return LayoutIntent Node which already contains defined attributes.
     */
    public LayoutIntent createLayoutIntent(Integer pages, String sides, Shape finishedDimensions, XYPair dimensions) {

        // create node
        LayoutIntent layoutIntent = super.createLayoutIntent();

        // set attributes
        layoutIntent.setPrintedPages(pages);
        if (sides != null) {
            layoutIntent.setSides(EnumSides.fromValue(sides));
        }
        layoutIntent.setFinishedDimensions(finishedDimensions);
        layoutIntent.setDimensions(dimensions);

        // return object
        return layoutIntent;
    }

    /**
     * Create new Created Node which already contains values for attributes AgentName, AgentVersion and TimeStamp.
     *
     * @param agentName Value for AgentName attribute.
     * @param agentVersion Value for AgentVersion attribute.
     * @param timestamp Value for TimeStamp attribute.
     *
     * @return Created Node which already contains defined attributes.
     */
    public Created createCreated(String agentName, String agentVersion, DateTime timestamp) {

        // create node
        Created created = super.createCreated();

        // set attributes
        created.setAgentName(agentName);
        created.setAgentVersion(agentVersion);
        created.setTimeStamp(timestamp);

        // return object
        return created;
    }

    /**
     * Create new ProductionIntent Node which already contains values for attribute PrintProcess.
     *
     * @param printProcess Value for PrintProcess attribute.
     *
     * @return ProductionIntent Node which already contains defined attributes.
     */
    public ProductionIntent createProductionIntent(String printProcess) {

        // create node
        ProductionIntent productionIntent = super.createProductionIntent();

        // set attributes
        productionIntent.setPrintProcess(printProcess);

        // return object
        return productionIntent;
    }

    /**
     * Create new ProofingIntent Node which already contains a ProofItem Node with an attribute BrandName.
     *
     * @param brandName Value for ProofItem BrandName attribute.
     *
     * @return ProofingIntent Node which already contains a ProofItem Node with defined attributes.
     */
    public ProofingIntent createProofingIntent(String brandName) {

        // create nodes
        ProofingIntent proofingIntent = super.createProofingIntent();
        ProofItem proofItem = super.createProofItem();

        // set attributes
        proofItem.setBrandName(brandName);
        proofingIntent.getProofItem().add(proofItem);

        // return object
        return proofingIntent;
    }

    /**
     * Create new BindingIntent Node which already contains values for attribute BindingType.
     *
     * @param bindingType Value for BindingType attribute.
     *
     * @return BindingIntent Node which already contains defined attributes.
     */
    public BindingIntent createBindingIntent(final EnumBindingType bindingType) {

        // return object
        return createBindingIntent(bindingType, null, null);
    }

    /**
     * Create new BindingIntent Node which already contains values for attribute BindingType.
     *
     * @param bindingType Value for BindingType attribute.
     * @param bindingSide Value for BindingSide attribute.
     * @param bindingOrder Value for BindingOrder attribute.
     *
     * @return BindingIntent Node which already contains defined attributes.
     */
    public BindingIntent createBindingIntent(
        final EnumBindingType bindingType, final String bindingSide, final String bindingOrder
    ) {

        // create node
        BindingIntent bindingIntent = super.createBindingIntent();

        // set attributes
        bindingIntent.setBindingType(bindingType);
        if (bindingSide != null) {
            bindingIntent.setBindingSide(EnumEdge.fromValue(bindingSide));
        }
        if (bindingOrder != null) {
            bindingIntent.setBindingOrder(EnumBindingOrder.fromValue(bindingOrder));
        }

        // return object
        return bindingIntent;
    }

    /**
     * Create new FoldingIntent Node which already contains values for attribute FoldingCatalog.
     *
     * @param foldingCatalog Value for FoldingCatalog attribute.
     *
     * @return FoldingIntent Node which already contains defined attributes.
     */
    public FoldingIntent createFoldingIntent(String foldingCatalog) {

        // create node
        FoldingIntent foldingIntent = super.createFoldingIntent();

        // set attributes
        foldingIntent.setFoldingCatalog(foldingCatalog);

        // return object
        return foldingIntent;
    }

    /**
     * Create new ColorIntent Node which already contains values for attribute NumColors.
     *
     * @param numColors Value for NumColors attribute.
     *
     * @return ColorIntent Node which already contains defined attributes.
     */
    public final ColorIntent createColorIntent(final IntegerList numColors) {
        ColorIntent colorIntent = super.createColorIntent();

        SurfaceColor frontColor = new SurfaceColor();
        frontColor.setSurface(EnumSurface.FRONT);
        frontColor.setNumColors(numColors.get(0));

        SurfaceColor backColor = new SurfaceColor();
        backColor.setSurface(EnumSurface.BACK);
        backColor.setNumColors(numColors.get(1));

        colorIntent.getSurfaceColor().add(frontColor);
        colorIntent.getSurfaceColor().add(backColor);

        // return object
        return colorIntent;
    }

    /**
     * Create a new MarkObject Node which already contains defined attributes.
     *
     * @param ctm Value of CTM attribute as String.
     * @param clipBox Value of ClipBox attribute as String.
     * @param ord Value of Ord attribute as Integer.
     *
     * @return MarkObject Node which already contains defined attributes.
     */
    public MarkObject createMarkObject(Matrix ctm, Rectangle clipBox, Integer ord) {

        // create node
        MarkObject markObject = super.createMarkObject();

        // set attributes
        markObject.setCTM(ctm);
        markObject.setClipBox(clipBox);
        markObject.setOrd(ord);

        // return object
        return markObject;
    }

    /**
     * Create a new ContentObject Node which already contains defined attributes.
     *
     * @param ctm Value of CTM attribute as String.
     * @param clipBox Value of ClipBox attribute as String.
     * @param ord Value of Ord attribute as Integer
     * @param trimCtm Value of TrimCTM as String
     * @param trimSize Value of TrimSize as String
     *
     * @return ContentObject Node which already contains defined attributes.
     */
    public ContentObject createContentObject(
        Matrix ctm, Rectangle clipBox, Integer ord, Matrix trimCtm, XYPair trimSize
    ) {

        // create node
        ContentObject contentObject = super.createContentObject();

        // set attributes
        contentObject.setCTM(ctm);
        contentObject.setClipBox(clipBox);
        contentObject.setOrd(ord);
        contentObject.setTrimCTM(trimCtm);
        contentObject.setTrimSize(trimSize);

        // return object
        return contentObject;
    }

    /**
     * Create a new Media Node which already contains defined attributes.
     *
     * @param dimensions Value of Dimensions attribute as XYPair.
     * @param mediaQuality Value of MediaQuality as String.
     *
     * @return Media Node which already contains defined attributes.
     */
    public Media createMedia(XYPair dimensions, String mediaQuality) {

        // create Media Node
        Media media = super.createMedia();

        // set attributes
        media.setDimension(dimensions);
        media.setMediaQuality(mediaQuality);

        // return node
        return media;
    }

    /**
     * Create a new BinderySignature Node which already contains defined attributes.
     *
     * @param foldCatalog Value of FoldCatalog attribute as String.
     *
     * @return BinderySignature Node which already contains defined attributes.
     */
    public BinderySignature createBinderySignature(String foldCatalog) {
        return createBinderySignature(foldCatalog, null, null);
    }

    /**
     * Create a new BinderySignature Node which already contains defined attributes.
     *
     * @param foldCatalog Value of FoldCatalog attribute as String.
     *
     * @return BinderySignature Node which already contains defined attributes.
     */
    public BinderySignature createBinderySignature(String foldCatalog, XYPair size, String assemblyID) {

        // create BinderySignature Node
        BinderySignature binderySignature = super.createBinderySignature();

        // set attributes
        binderySignature.setFoldCatalog(foldCatalog);
        binderySignature.setBinderySignatureSize(size);
        binderySignature.setBinderySignatureID(assemblyID);

        // return node
        return binderySignature;
    }

    /**
     * Create a new SignatureCell Node which already contains defined attributes.
     *
     * @param trim All Trim attributes (TrimFace, TrimFoot, TrimHead, TrimSpine) as Double.
     * @param trimBox TrimBox attribute as Double.
     * @param backOverfold BackOverfold attribute as Double.
     * @param frontOverfold FrontOverfold attribute as Double.
     *
     * @return SignatureCell Node which already contains defined attributes.
     */
    public SignatureCell createSignatureCell(Double trim, XYPair trimBox, Double backOverfold, Double frontOverfold) {

        // create SignatureCell Node
        SignatureCell signatureCell = super.createSignatureCell();

        // set attributes
        signatureCell.setBackOverfold(backOverfold);
        signatureCell.setFrontOverfold(frontOverfold);
        signatureCell.setTrimFace(trim);
        signatureCell.setTrimFoot(trim);
        signatureCell.setTrimHead(trim);
        signatureCell.setSpine(trim);
        signatureCell.setTrimSize(trimBox);

        // return node
        return signatureCell;
    }

    /**
     * Create a new Position Node which already contains defined attributes.
     *
     * @param absoluteBox AbsoluteBox attribute as Rectangle.
     * @param orientation Orientation attribute as EnumOrientation.
     *
     * @return Position Node which already contains defined attributes.
     */
    public Position createPosition(Rectangle absoluteBox, Orientation orientation) {
        return createPosition(absoluteBox, orientation, null);
    }

    /**
     * Create a new Position Node which already contains defined attributes.
     *
     * @param absoluteBox AbsoluteBox attribute as Rectangle.
     * @param orientation Orientation attribute as EnumOrientation.
     * @param assemblyID Orientation attribute as AssemblyID.
     *
     * @return Position Node which already contains defined attributes.
     */
    public Position createPosition(Rectangle absoluteBox, Orientation orientation, String assemblyID) {

        // create Position Node
        Position position = super.createPosition();

        // set attributes
        position.setAbsoluteBox(absoluteBox);
        position.setOrientation(orientation);
        position.setAssemblyID(assemblyID);

        // return node
        return position;
    }

    /**
     * Create a new AmountPool Node which already contains a PartAmount Subelement with attribute amount.
     *
     * @param amount Amount attribute of Subnode PartAmount.
     *
     * @return AmountPool Node which already contains a PartAmount Subelement with attribute amount.
     * @deprecated Since amount is of type double you should not use this method.
     */
    public AmountPool createAmountPool(Integer amount) {

        // create AmountPool Node
        AmountPool amountPool = super.createAmountPool();

        // set attributes
        PartAmount partAmount = super.createPartAmount();
        partAmount.setAmount((double) amount);
        amountPool.getPartAmount().add(partAmount);

        // return node
        return amountPool;
    }

    /**
     * Create a new ColorantControl Node which already contains a processColorModel.
     *
     * @param processColorModel ProcessColorModel attribute as String.
     *
     * @return ColorantControl Node which already contains defined attributes.
     */
    public ColorantControl createColorantControl(final EnumProcessColorModel processColorModel) {

        // create node
        ColorantControl colorantControl = super.createColorantControl();

        // set attributes
        colorantControl.setProcessColorModel(processColorModel);

        // return node
        return colorantControl;
    }

}