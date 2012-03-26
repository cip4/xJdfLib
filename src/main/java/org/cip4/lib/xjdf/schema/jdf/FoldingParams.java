
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoldingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoldingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Fold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="FoldCatalog" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SheetLay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoldingParams", propOrder = {
    "folds"
})
public class FoldingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Fold")
    protected List<Fold> folds;
    @XmlAttribute(name = "FoldCatalog")
    protected String foldCatalog;
    @XmlAttribute(name = "SheetLay")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetLay;

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
     * Gets the value of the sheetLay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetLay() {
        return sheetLay;
    }

    /**
     * Sets the value of the sheetLay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetLay(String value) {
        this.sheetLay = value;
    }

}
