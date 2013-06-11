
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FolderModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="ProductionType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FolderProduction")
public class FolderProduction
    implements Serializable
{

    @XmlAttribute(name = "FolderModuleIndex")
    protected Integer folderModuleIndex;
    @XmlAttribute(name = "ProductionType")
    @XmlSchemaType(name = "anySimpleType")
    protected String productionType;

    /**
     * Gets the value of the folderModuleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderModuleIndex() {
        return folderModuleIndex;
    }

    /**
     * Sets the value of the folderModuleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderModuleIndex(Integer value) {
        this.folderModuleIndex = value;
    }

    /**
     * Gets the value of the productionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionType() {
        return productionType;
    }

    /**
     * Sets the value of the productionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionType(String value) {
        this.productionType = value;
    }

}
