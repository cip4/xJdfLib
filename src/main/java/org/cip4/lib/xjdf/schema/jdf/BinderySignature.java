
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BinderySignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinderySignature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Fold" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}SignatureCell" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="BindingEdge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BindingOrientation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="JogEdge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FoldCatalog" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="WebCellAlignment" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StaggerContinuous" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="StaggerRows" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BinderySignatureType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FoldLay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AlignmentReferenceWeb" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="OutsideGutter" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="NumberUp" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="StaggerColumns" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="DieLayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinderySignature", propOrder = {
    "signatureCells",
    "folds"
})
public class BinderySignature
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "SignatureCell")
    protected List<SignatureCell> signatureCells;
    @XmlElement(name = "Fold")
    protected List<Fold> folds;
    @XmlAttribute(name = "BindingEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingEdge;
    @XmlAttribute(name = "BindingOrientation")
    @XmlSchemaType(name = "anySimpleType")
    protected String bindingOrientation;
    @XmlAttribute(name = "JogEdge")
    @XmlSchemaType(name = "anySimpleType")
    protected String jogEdge;
    @XmlAttribute(name = "FoldCatalog")
    protected String foldCatalog;
    @XmlAttribute(name = "WebCellAlignment")
    protected List<Double> webCellAlignments;
    @XmlAttribute(name = "StaggerContinuous")
    protected Boolean staggerContinuous;
    @XmlAttribute(name = "StaggerRows")
    protected String staggerRows;
    @XmlAttribute(name = "BinderySignatureType")
    @XmlSchemaType(name = "anySimpleType")
    protected String binderySignatureType;
    @XmlAttribute(name = "FoldLay")
    @XmlSchemaType(name = "anySimpleType")
    protected String foldLay;
    @XmlAttribute(name = "AlignmentReferenceWeb")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alignmentReferenceWeb;
    @XmlAttribute(name = "OutsideGutter")
    protected Boolean outsideGutter;
    @XmlAttribute(name = "NumberUp")
    protected List<Double> numberUps;
    @XmlAttribute(name = "StaggerColumns")
    protected String staggerColumns;
    @XmlAttribute(name = "DieLayoutRef")
    @XmlIDREF
    protected Object dieLayoutRef;

    /**
     * Gets the value of the signatureCells property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureCells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureCells().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureCell }
     * 
     * 
     */
    public List<SignatureCell> getSignatureCells() {
        if (signatureCells == null) {
            signatureCells = new ArrayList<SignatureCell>();
        }
        return this.signatureCells;
    }

    /**
     * Gets the value of the folds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fold }
     * 
     * 
     */
    public List<Fold> getFolds() {
        if (folds == null) {
            folds = new ArrayList<Fold>();
        }
        return this.folds;
    }

    /**
     * Gets the value of the bindingEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingEdge() {
        return bindingEdge;
    }

    /**
     * Sets the value of the bindingEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingEdge(String value) {
        this.bindingEdge = value;
    }

    /**
     * Gets the value of the bindingOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingOrientation() {
        return bindingOrientation;
    }

    /**
     * Sets the value of the bindingOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingOrientation(String value) {
        this.bindingOrientation = value;
    }

    /**
     * Gets the value of the jogEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJogEdge() {
        return jogEdge;
    }

    /**
     * Sets the value of the jogEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJogEdge(String value) {
        this.jogEdge = value;
    }

    /**
     * Gets the value of the foldCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldCatalog() {
        return foldCatalog;
    }

    /**
     * Sets the value of the foldCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldCatalog(String value) {
        this.foldCatalog = value;
    }

    /**
     * Gets the value of the webCellAlignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webCellAlignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebCellAlignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWebCellAlignments() {
        if (webCellAlignments == null) {
            webCellAlignments = new ArrayList<Double>();
        }
        return this.webCellAlignments;
    }

    /**
     * Gets the value of the staggerContinuous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaggerContinuous() {
        return staggerContinuous;
    }

    /**
     * Sets the value of the staggerContinuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaggerContinuous(Boolean value) {
        this.staggerContinuous = value;
    }

    /**
     * Gets the value of the staggerRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaggerRows() {
        return staggerRows;
    }

    /**
     * Sets the value of the staggerRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaggerRows(String value) {
        this.staggerRows = value;
    }

    /**
     * Gets the value of the binderySignatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderySignatureType() {
        return binderySignatureType;
    }

    /**
     * Sets the value of the binderySignatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderySignatureType(String value) {
        this.binderySignatureType = value;
    }

    /**
     * Gets the value of the foldLay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldLay() {
        return foldLay;
    }

    /**
     * Sets the value of the foldLay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldLay(String value) {
        this.foldLay = value;
    }

    /**
     * Gets the value of the alignmentReferenceWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignmentReferenceWeb() {
        return alignmentReferenceWeb;
    }

    /**
     * Sets the value of the alignmentReferenceWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignmentReferenceWeb(String value) {
        this.alignmentReferenceWeb = value;
    }

    /**
     * Gets the value of the outsideGutter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutsideGutter() {
        return outsideGutter;
    }

    /**
     * Sets the value of the outsideGutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutsideGutter(Boolean value) {
        this.outsideGutter = value;
    }

    /**
     * Gets the value of the numberUps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberUps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberUps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getNumberUps() {
        if (numberUps == null) {
            numberUps = new ArrayList<Double>();
        }
        return this.numberUps;
    }

    /**
     * Gets the value of the staggerColumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaggerColumns() {
        return staggerColumns;
    }

    /**
     * Sets the value of the staggerColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaggerColumns(String value) {
        this.staggerColumns = value;
    }

    /**
     * Gets the value of the dieLayoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDieLayoutRef() {
        return dieLayoutRef;
    }

    /**
     * Sets the value of the dieLayoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDieLayoutRef(Object value) {
        this.dieLayoutRef = value;
    }

}
