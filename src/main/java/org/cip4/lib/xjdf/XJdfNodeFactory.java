/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf;

import java.util.List;

import org.cip4.lib.xjdf.schema.ApprovalParams;
import org.cip4.lib.xjdf.schema.BindingIntent;
import org.cip4.lib.xjdf.schema.ChildProduct;
import org.cip4.lib.xjdf.schema.ColorIntent;
import org.cip4.lib.xjdf.schema.Comment;
import org.cip4.lib.xjdf.schema.ContentObject;
import org.cip4.lib.xjdf.schema.CustomerInfo;
import org.cip4.lib.xjdf.schema.FileSpec;
import org.cip4.lib.xjdf.schema.FoldingIntent;
import org.cip4.lib.xjdf.schema.GeneralID;
import org.cip4.lib.xjdf.schema.LayoutIntent;
import org.cip4.lib.xjdf.schema.MarkObject;
import org.cip4.lib.xjdf.schema.MediaIntent;
import org.cip4.lib.xjdf.schema.NodeInfo;
import org.cip4.lib.xjdf.schema.ObjectFactory;
import org.cip4.lib.xjdf.schema.ProductionIntent;
import org.cip4.lib.xjdf.schema.ProofItem;
import org.cip4.lib.xjdf.schema.ProofingIntent;
import org.cip4.lib.xjdf.schema.RunList;
import org.cip4.lib.xjdf.type.DateTime;
import org.cip4.lib.xjdf.type.Matrix;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.type.Shape;
import org.cip4.lib.xjdf.type.XYPair;

/**
 * Static Factory Class which is managing the creation of XJdfNodes.
 * @author s.meissner
 * @date 05.03.2012
 */
public class XJdfNodeFactory extends ObjectFactory {

	/**
	 * Private default constructor. Class cannot being instantiated from external.
	 */
	private XJdfNodeFactory() {
		// no action
	}

	/**
	 * Get instance of XJdfNodeFactory.
	 * @return
	 */
	public static XJdfNodeFactory newInstance() {
		return new XJdfNodeFactory();
	}

	/**
	 * Create a new pre-filled GeneralID Node.
	 * @param idUsage Value of node attribute 'IDUsage'.
	 * @param idValue Value of node attribute 'IDValue'.
	 * @return Pre-filled GeneralID object.
	 */
	public GeneralID createGeneralID(String idUsage, String idValue) {

		// create new GeneralID object
		GeneralID generalId = XJdfNodeFactory.newInstance().createGeneralID();
		generalId.setIDUsage(idUsage);
		generalId.setIDValue(idValue);

		// return GeneralID
		return generalId;
	}

	/**
	 * Create a new RunList Node which already contains a FileSpec URL definition.
	 * @param fileSpecUrl URL attribute in element FileSpec.
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
	 * Create a new Comment Node which already contains a comment string as text.
	 * @param comment Comment Node text value.
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
	 * @param minApprovals Value for MinApprovals attribute.
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
	 * @param customerID Value for CustomerID attribute.
	 * @return CustomerInfo Node which already contains defined attributes.
	 */
	public CustomerInfo createCustomerInfo(String customerID) {

		// create node
		CustomerInfo customerInfo = super.createCustomerInfo();

		// set attributes
		customerInfo.setCustomerID(customerID);

		// return object
		return customerInfo;
	}

	/**
	 * Create a new NodeInfo Node which already contains values for attributes TotalDuration, End and NaturalLang.
	 * @param totalDuration Value for NodeInfo attribute.
	 * @param end Value for End attribute.
	 * @param naturalLang Value for NaturalLang attribute.
	 * @return NodeInfo Node which already contains defined attributes.
	 */
	public NodeInfo createNodeInfo(String totalDuration, DateTime end, String naturalLang) {

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
	 * Create new ChildProduct Node which already contains values for attribute Childref.
	 * @param childref Value for Childref attribute.
	 * @return ChildProduct Node which already contains defined attributes.
	 */
	public ChildProduct createChildProduct(String childref) {

		// create node
		ChildProduct childProduct = super.createChildProduct();

		// set attributes
		childProduct.setChildRef(childref);

		// return object
		return childProduct;
	}

	/**
	 * Create new MediaIntent Node which already contains values for attribute MediaQuality.
	 * @param mediaQuality Value for MediaQuality attribute.
	 * @return MediaIntent Node which already contains defined attributes.
	 */
	public MediaIntent createMediaIntent(String mediaQuality) {

		// return object
		return createMediaIntent(mediaQuality, null, null);
	}

	/**
	 * Create new MediaIntent Node which already contains values for attributes MediaQuality, StockBrand and Weight.
	 * @param mediaQuality Value for MediaQuality attribute.
	 * @param stockBrand Value for StockBrand attribute.
	 * @param weight Value for Weight attribute.
	 * @return MediaIntent Node which already contains defined attributes.
	 */
	public MediaIntent createMediaIntent(String mediaQuality, String brand, Double weight) {

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
	 * Create new LayoutIntent Node which already contains values for attribute Pages.
	 * @param pages Value for Pages attribute.
	 * @return LayoutIntent Node which already contains defined attributes.
	 */
	public LayoutIntent createLayoutIntent(Integer pages) {

		// return object
		return createLayoutIntent(pages, null, null, null);
	}

	/**
	 * Create new LayoutIntent Node which already contains values for attributes Pages, Sides, FinishedDimensions and Dimensions.
	 * @param pages Value for Pages attribute.
	 * @param sides Value for Sides attribute.
	 * @param finishedDimensions Value for FinishedDimensions attribute.
	 * @return LayoutIntent Node which already contains defined attributes.
	 */
	public LayoutIntent createLayoutIntent(Integer pages, String sides, Shape finishedDimensions) {

		// return object
		return createLayoutIntent(pages, sides, finishedDimensions, null);
	}

	/**
	 * Create new LayoutIntent Node which already contains values for attributes Pages, Sides, FinishedDimensions and Dimensions.
	 * @param pages Value for Pages attribute.
	 * @param sides Value for Sides attribute.
	 * @param finishedDimensions Value for FinishedDimensions attribute.
	 * @param dimensions Value for Dimensions attribute.
	 * @return LayoutIntent Node which already contains defined attributes.
	 */
	public LayoutIntent createLayoutIntent(Integer pages, String sides, Shape finishedDimensions, XYPair dimensions) {

		// create node
		LayoutIntent layoutIntent = super.createLayoutIntent();

		// set attributes
		layoutIntent.setPages(pages);
		layoutIntent.setSides(sides);
		layoutIntent.setFinishedDimensions(finishedDimensions);
		layoutIntent.setDimensions(dimensions);

		// return object
		return layoutIntent;
	}

	/**
	 * Create new ProductionIntent Node which already contains values for attribute PrintProcess.
	 * @param printProcess Value for PrintProcess attribute.
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
	 * @param brandName Value for ProofItem BrandName attribute.
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
	 * @param bindingType Value for BindingType attribute.
	 * @return BindingIntent Node which already contains defined attributes.
	 */
	public BindingIntent createBindingIntent(String bindingType) {

		// create node
		BindingIntent bindingIntent = super.createBindingIntent();

		// set attributes
		bindingIntent.setBindingType(bindingType);

		// return object
		return bindingIntent;
	}

	/**
	 * Create new FoldingIntent Node which already contains values for attribute FoldingCatalog.
	 * @param foldingCatalog Value for FoldingCatalog attribute.
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
	 * @param numColors Value for NumColors attribute.
	 * @return ColorIntent Node which already contains defined attributes.
	 */
	public ColorIntent createColorIntent(List<Integer> numColors) {

		// return object
		return createColorIntent(numColors, null, null, null, null);
	}

	/**
	 * Create new ColorIntent Node which already contains values for attributes NumColors, ColorsUsed and Coatings.
	 * @param numColors Value for NumColors attribute.
	 * @param colorsUsed Value for ColorsUsed attribute.
	 * @param coatings Value for Coatings attribute.
	 * @return ColorIntent Node which already contains defined attributes.
	 */
	public ColorIntent createColorIntent(List<Integer> numColors, List<String> colorsUsed, List<String> colorsUsedBack, String coatings, String coatingsBack) {

		// create node
		ColorIntent colorIntent = super.createColorIntent();

		// TODO ColorUsedBack
		// TODO CoatingsBack
		// set attributes

		colorIntent.getNumColors().addAll(numColors);

		if (colorsUsed != null)
			colorIntent.getColorsUsed().addAll(colorsUsed);

		if (colorsUsedBack != null)
			colorIntent.getColorsUsedBack().addAll(colorsUsedBack);

		colorIntent.setCoatings(coatings);
		colorIntent.setCoatingsBack(coatingsBack);

		// return object
		return colorIntent;
	}

	/**
	 * Create a new MarkObject Node which already contains defined attributes.
	 * @param ctm Value of CTM attribute as String.
	 * @param clipBox Value of ClipBox attribute as String.
	 * @param ord Value of Ord attribute as Integer.
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
	 * @param ctm Value of CTM attribute as String.
	 * @param clipBox Value of ClipBox attribute as String.
	 * @param ord Value of Ord attribute as Integer
	 * @param trimCtm Value of TrimCTM as String
	 * @param trimSize Value of TrimSize as String
	 * @return ContentObject Node which already contains defined attributes.
	 */
	public ContentObject createContentObject(Matrix ctm, Rectangle clipBox, Integer ord, Matrix trimCtm, XYPair trimSize) {

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
}