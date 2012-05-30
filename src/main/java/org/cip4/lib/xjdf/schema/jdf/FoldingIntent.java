
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FoldingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoldingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Fold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="FoldingCatalog" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoldingIntent", propOrder = {
    "folds"
})
public class FoldingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "Fold")
    protected List<Fold> folds;
    @XmlAttribute(name = "FoldingCatalog")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String foldingCatalog;

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
     * Gets the value of the foldingCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldingCatalog() {
        return foldingCatalog;
    }

    /**
     * Sets the value of the foldingCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldingCatalog(String value) {
        this.foldingCatalog = value;
    }

}
