package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.*;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Duration;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.URI;
import org.cip4.lib.xjdf.type.XYPair;
import org.cip4.lib.xjdf.xml.XJdfConstants;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * Static Factory Class which is managing the creation of XJdfNodes.
 *
 * @deprecated Has been replaced by a fluent interface implementation.
 */
@Deprecated
public class XJdfNodeFactory extends ObjectFactory {

    /**
     * Create a new Resource node from ResourceType.
     *
     * @param specificResource The ResourceType Node
     *
     * @return New Resource node from ResourceType node.
     */
    public final Resource createResource(final SpecificResource specificResource) {

        return createResource(specificResource, null);
    }

    /**
     * Create a new Resource node from ResourceType and Part.
     *
     * @param specificResource The ResourceType Node
     * @param part The Part Node
     *
     * @return New Resource node from ResourceType and Part node.
     */
    public final Resource createResource(final SpecificResource specificResource, final Part part) {

        if (specificResource == null) {
            return null;
        }

        // get resource name
        String paramName = specificResource.getClass().getSimpleName();

        // create resource
        Resource resource = super.createResource();

        QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, paramName);
        JAXBElement obj = new JAXBElement(qname, specificResource.getClass(), null, specificResource);
        resource.setSpecificResource(obj);

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
     * @param brand Value for StockBrand attribute.
     * @param weight Value for Weight attribute.
     *
     * @return MediaIntent Node which already contains defined attributes.
     */
    public final MediaIntent createMediaIntent(
        final String mediaQuality,
        final String brand,
        final Float weight
    ) {

        // create node
        MediaIntent mediaIntent = super.createMediaIntent();

        // set attributes
        mediaIntent.setMediaQuality(mediaQuality);
        mediaIntent.setBrand(brand);
        mediaIntent.setWeight(weight);

        // return object
        return mediaIntent;
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
     * Create new FoldingIntent Node which already contains values for attribute FoldCatalog.
     *
     * @param foldCatalog Value for FoldCatalog attribute.
     *
     * @return FoldingIntent Node which already contains defined attributes.
     */
    public final FoldingIntent createFoldingIntent(final String foldCatalog) {

        // create node
        FoldingIntent foldingIntent = super.createFoldingIntent();

        // set attributes
        foldingIntent.setFoldCatalog(foldCatalog);

        // return object
        return foldingIntent;
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
        BinderySignature binderySignature = super.createBinderySignature();
        binderySignature.setFoldCatalog(foldCatalog);
        return binderySignature;
    }

    /**
     * Create a new Position Node which already contains defined attributes.
     *
     * @param absoluteBox AbsoluteBox attribute as Rectangle.
     * @param orientation Orientation attribute as EnumOrientation.
     *
     * @return Position Node which already contains defined attributes.
     */
    public final Position createPosition(
        final Rectangle absoluteBox,
        final Orientation orientation
    ) {

        // create Position Node
        Position position = super.createPosition();

        // set attributes
        position.setAbsoluteBox(absoluteBox);
        position.setOrientation(orientation);

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


}