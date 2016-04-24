package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.AmountPool;
import org.cip4.lib.xjdf.schema.ApprovalParams;
import org.cip4.lib.xjdf.schema.BinderySignature;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.ChildProduct;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.ColorantControl;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.ContentObject;
import org.cip4.lib.xjdf.schema.Created;
import org.cip4.lib.xjdf.schema.CustomerInfo;
import org.cip4.lib.xjdf.schema.CuttingParams;
import org.cip4.lib.xjdf.schema.EnumBindingOrder;
import org.cip4.lib.xjdf.schema.EnumEdge;
import org.cip4.lib.xjdf.schema.EnumSides;
import org.cip4.lib.xjdf.schema.EnumSurface;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MarkObject;
import org.cip4.lib.xjdf.schema.Media;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.Modified;
import org.cip4.lib.xjdf.schema.NodeInfo;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.Orientation;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.PartAmount;
import org.cip4.lib.xjdf.schema.Position;
import org.cip4.lib.xjdf.schema.Preview;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.schema.ProductionIntent;
import org.cip4.lib.xjdf.schema.ProofItem;
import org.cip4.lib.xjdf.schema.ProofingIntent;
import org.cip4.lib.xjdf.schema.Resource;
import org.cip4.lib.xjdf.schema.ResourceType;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.schema.SignatureCell;
import org.cip4.lib.xjdf.schema.SurfaceColor;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.IntegerList;
import org.cip4.lib.xjdf.type.Matrix;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.type.XYPair;
import org.cip4.lib.xjdf.xml.XJdfConstants;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * Static Factory Class which is managing the creation of XJdfNodes.
 */
public class XJdfNodeFactory extends ObjectFactory {
    /**
     * Create a new Parameter node from ParameterType.
     *
     * @param parameterType The ParameterType Node
     *
     * @return New Parameter node from ParametType node.
     */
    public final Parameter createParameter(final ParameterType parameterType) {

        return createParameter(parameterType, null);
    }

    /**
     * Create a new Parameter node from ParameterType and Part.
     *
     * @param parameterType The ParameterType Node
     * @param part The Part Node
     *
     * @return New Parameter node from ParametType and Part node.
     */
    public final Parameter createParameter(final ParameterType parameterType, final Part part) {

        if (parameterType == null) {
            return null;
        }

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
     * Create a new Resource node from ResourceType and Part.
     *
     * @param resourceType The ResourceType Node
     * @param part The Part Node
     *
     * @return New Resource node from ResourceType and Part node.
     */
    public final Resource createResource(final ResourceType resourceType, final Part part) {

        if (resourceType == null) {
            return null;
        }

        // get resource name
        String paramName = resourceType.getClass().getSimpleName();

        // create resource
        Resource resource = super.createResource();

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement obj = new JAXBElement(qname, resourceType.getClass(), null, resourceType);
        resource.setResourceType(obj);

        if (part != null) {
            resource.getPart().add(part);
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
    public final GeneralID createGeneralID(final String idUsage, final String idValue) {

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
    public final RunList createRunList(final URI fileSpecUrl) {

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
    public final CuttingParams createCuttingParams(final URI fileSpecUrl) {

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
    public final Comment createComment(final String comment) {

        // create Comment Node
        Comment obj = super.createComment();

        // set attribute
        obj.setValue(comment);

        // return object
        return obj;
    }

    /**
     * Create a new ApprovalParams Node which already contains values for attributes MinApprovals.
     *
     * @param minApprovals Value for MinApprovals attribute.
     *
     * @return ApprovalParams Node which already contains defined attributes.
     */
    public final ApprovalParams createApprovalParams(final int minApprovals) {

        // create node
        ApprovalParams approvalParams = super.createApprovalParams();

        // set attributes
        approvalParams.setMinApprovals(minApprovals);

        // return object
        return approvalParams;
    }

    /**
     * Create a new CustomerInfo Node which already contains values for attribute CustomerID.
     *
     * @param customerID Value for CustomerID attribute.
     *
     * @return CustomerInfo Node which already contains defined attributes.
     */
    public final CustomerInfo createCustomerInfo(final String customerID) {

        return createCustomerInfo(customerID, null);
    }

    /**
     * Create a new CustomerInfo Node which already contains values for attribute CustomerID.
     *
     * @param customerID Value for CustomerID attribute.
     * @param customerOrderID Value for CustomerOrderID attribute.
     *
     * @return CustomerInfo Node which already contains defined attributes.
     */
    public final CustomerInfo createCustomerInfo(final String customerID, final String customerOrderID) {

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
    public final NodeInfo createNodeInfo(final Duration totalDuration) {

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
     * @param jobPriority Priority of the job.
     *
     * @return NodeInfo Node which already contains defined attributes.
     */
    public final NodeInfo createNodeInfo(final Integer jobPriority) {

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
    public final NodeInfo createNodeInfo(final DateTime end) {

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
    public final NodeInfo createNodeInfo(
        final Duration totalDuration,
        final DateTime end,
        final String naturalLang
    ) {

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
     * @param url Value for URL attribute.
     *
     * @return Preview Node which already contains defined attributes.
     */
    public final Preview createPreview(final URI url) {

        return createPreview(url, null);
    }

    /**
     * Create a new Preview Node which already contains values for attributes PreviewUsage, URL and PreviewFileType.
     *
     * @param url Value for URL attribute.
     * @param previewFileType Value for PreviewFileType attribute.
     *
     * @return Preview Node which already contains defined attributes.
     */
    public final Preview createPreview(final URI url, final String previewFileType) {

        // create node
        Preview preview = super.createPreview();

        // set attributes
        preview.setURL(url);
        preview.setPreviewFileType(previewFileType);

        // return object
        return preview;
    }

    /**
     * Create new ChildProduct Node which already contains values for attribute Childref.
     *
     * @param idRef Value for Product attribute.
     *
     * @return ChildProduct Node which already contains defined attributes.
     */
    public final ChildProduct createChildProduct(final Product idRef) {

        // create node
        ChildProduct childProduct = super.createChildProduct();

        // set attributes
        childProduct.setChildRef(idRef);

        // return object
        return childProduct;
    }

    /**
     * Create new MediaIntent Node which already contains values for attribute MediaQuality.
     *
     * @param mediaQuality Value for MediaQuality attribute.
     *
     * @return MediaIntent Node which already contains defined attributes.
     */
    public final MediaIntent createMediaIntent(final String mediaQuality) {

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
    public final MediaIntent createMediaIntent(
        final String mediaQuality,
        final String stockBrand,
        final Double weight
    ) {

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
    public final LayoutIntent createLayoutIntent(final Integer pages) {

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
    public final LayoutIntent createLayoutIntent(
        final Integer pages,
        final EnumSides sides,
        final Shape finishedDimensions
    ) {

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
    public final LayoutIntent createLayoutIntent(
        final Integer pages,
        final EnumSides sides,
        final Shape finishedDimensions,
        final XYPair dimensions
    ) {

        // create node
        LayoutIntent layoutIntent = super.createLayoutIntent();

        // set attributes
        layoutIntent.setPrintedPages(pages);
        layoutIntent.setSides(sides);
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
    public final Created createCreated(
        final String agentName,
        final String agentVersion,
        final DateTime timestamp
    ) {

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
    public final ProductionIntent createProductionIntent(final String printProcess) {

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
    public final ProofingIntent createProofingIntent(final String brandName) {

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
    public final BindingIntent createBindingIntent(final String bindingType) {

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
    public final BindingIntent createBindingIntent(
        final String bindingType,
        final EnumEdge bindingSide,
        final EnumBindingOrder bindingOrder
    ) {

        // create node
        BindingIntent bindingIntent = super.createBindingIntent();

        // set attributes
        bindingIntent.setBindingType(bindingType);
        bindingIntent.setBindingSide(bindingSide);
        bindingIntent.setBindingOrder(bindingOrder);

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
    public final FoldingIntent createFoldingIntent(final String foldingCatalog) {

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
    public final MarkObject createMarkObject(
        final Matrix ctm,
        final Rectangle clipBox,
        final Integer ord
    ) {

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
    public final ContentObject createContentObject(
        final Matrix ctm,
        final Rectangle clipBox,
        final Integer ord,
        final Matrix trimCtm,
        final XYPair trimSize
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
    public final Media createMedia(final XYPair dimensions, final String mediaQuality) {

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
    public final BinderySignature createBinderySignature(final String foldCatalog) {

        return createBinderySignature(foldCatalog, null, null);
    }

    /**
     * Create a new BinderySignature Node which already contains defined attributes.
     *
     * @param foldCatalog Value of FoldCatalog attribute as String.
     * @param size Size of the bindery signature.
     * @param assemblyID Assembly id.
     *
     * @return BinderySignature Node which already contains defined attributes.
     */
    public final BinderySignature createBinderySignature(
        final String foldCatalog,
        final XYPair size,
        final String assemblyID
    ) {

        // create BinderySignature Node
        BinderySignature binderySignature = super.createBinderySignature();

        // set attributes
        binderySignature.setFoldCatalog(foldCatalog);
        binderySignature.setBinderySignatureSize(size);
        binderySignature.setAssemblyID(assemblyID);

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
    public final SignatureCell createSignatureCell(
        final Double trim,
        final XYPair trimBox,
        final Double backOverfold,
        final Double frontOverfold
    ) {

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
    public final Position createPosition(final Rectangle absoluteBox, final Orientation orientation) {

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
    public final Position createPosition(
        final Rectangle absoluteBox,
        final Orientation orientation,
        final String assemblyID
    ) {

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
     */
    public final AmountPool createAmountPool(final Double amount) {

        // create AmountPool Node
        AmountPool amountPool = super.createAmountPool();

        // set attributes
        PartAmount partAmount = super.createPartAmount();
        partAmount.setAmount(amount);
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
    public final ColorantControl createColorantControl(final String processColorModel) {

        // create node
        ColorantControl colorantControl = super.createColorantControl();

        // set attributes
        colorantControl.setProcessColorModel(processColorModel);

        // return node
        return colorantControl;
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
    public final Modified createModified(
        final String agentName,
        final String agentVersion,
        final DateTime timestamp
    ) {

        // create node
        Modified modified = super.createModified();

        // set attributes
        modified.setAgentName(agentName);
        modified.setAgentVersion(agentVersion);
        modified.setTimeStamp(timestamp);

        // return object
        return modified;
    }

}