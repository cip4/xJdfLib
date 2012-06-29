
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FontParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="SubsetFonts" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="MaxSubsetPct" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="CannotEmbedFontPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NeverEmbed" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="EmbedAllFonts" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="AlwaysEmbed" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontParams")
public class FontParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "SubsetFonts")
    protected Boolean subsetFonts;
    @XmlAttribute(name = "MaxSubsetPct")
    protected Integer maxSubsetPct;
    @XmlAttribute(name = "CannotEmbedFontPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String cannotEmbedFontPolicy;
    @XmlAttribute(name = "NeverEmbed")
    protected List<String> neverEmbeds;
    @XmlAttribute(name = "EmbedAllFonts")
    protected Boolean embedAllFonts;
    @XmlAttribute(name = "AlwaysEmbed")
    protected List<String> alwaysEmbeds;

    /**
     * Gets the value of the subsetFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsetFonts() {
        return subsetFonts;
    }

    /**
     * Sets the value of the subsetFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsetFonts(Boolean value) {
        this.subsetFonts = value;
    }

    /**
     * Gets the value of the maxSubsetPct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSubsetPct() {
        return maxSubsetPct;
    }

    /**
     * Sets the value of the maxSubsetPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSubsetPct(Integer value) {
        this.maxSubsetPct = value;
    }

    /**
     * Gets the value of the cannotEmbedFontPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCannotEmbedFontPolicy() {
        return cannotEmbedFontPolicy;
    }

    /**
     * Sets the value of the cannotEmbedFontPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCannotEmbedFontPolicy(String value) {
        this.cannotEmbedFontPolicy = value;
    }

    /**
     * Gets the value of the neverEmbeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neverEmbeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeverEmbeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNeverEmbeds() {
        if (neverEmbeds == null) {
            neverEmbeds = new ArrayList<String>();
        }
        return this.neverEmbeds;
    }

    /**
     * Gets the value of the embedAllFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedAllFonts() {
        return embedAllFonts;
    }

    /**
     * Sets the value of the embedAllFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedAllFonts(Boolean value) {
        this.embedAllFonts = value;
    }

    /**
     * Gets the value of the alwaysEmbeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alwaysEmbeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlwaysEmbeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlwaysEmbeds() {
        if (alwaysEmbeds == null) {
            alwaysEmbeds = new ArrayList<String>();
        }
        return this.alwaysEmbeds;
    }

}
