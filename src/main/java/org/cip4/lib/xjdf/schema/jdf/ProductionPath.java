
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductionPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionPath">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PrintingUnitWebPath" type="{http://www.CIP4.org/JDFSchema_2_0}ProductionSubPath" minOccurs="0"/>
 *           &lt;element name="FolderSuperStructureWebPath" type="{http://www.CIP4.org/JDFSchema_2_0}ProductionSubPath" minOccurs="0"/>
 *           &lt;element name="PostPressComponentPath" type="{http://www.CIP4.org/JDFSchema_2_0}ProductionSubPath" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ProductionPathID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionPath", propOrder = {
    "postPressComponentPath",
    "folderSuperStructureWebPath",
    "printingUnitWebPath"
})
public class ProductionPath
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "PostPressComponentPath", namespace = "")
    protected ProductionSubPath postPressComponentPath;
    @XmlElement(name = "FolderSuperStructureWebPath", namespace = "")
    protected ProductionSubPath folderSuperStructureWebPath;
    @XmlElement(name = "PrintingUnitWebPath", namespace = "")
    protected ProductionSubPath printingUnitWebPath;
    @XmlAttribute(name = "ProductionPathID")
    protected String productionPathID;

    /**
     * Gets the value of the postPressComponentPath property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionSubPath }
     *     
     */
    public ProductionSubPath getPostPressComponentPath() {
        return postPressComponentPath;
    }

    /**
     * Sets the value of the postPressComponentPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionSubPath }
     *     
     */
    public void setPostPressComponentPath(ProductionSubPath value) {
        this.postPressComponentPath = value;
    }

    /**
     * Gets the value of the folderSuperStructureWebPath property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionSubPath }
     *     
     */
    public ProductionSubPath getFolderSuperStructureWebPath() {
        return folderSuperStructureWebPath;
    }

    /**
     * Sets the value of the folderSuperStructureWebPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionSubPath }
     *     
     */
    public void setFolderSuperStructureWebPath(ProductionSubPath value) {
        this.folderSuperStructureWebPath = value;
    }

    /**
     * Gets the value of the printingUnitWebPath property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionSubPath }
     *     
     */
    public ProductionSubPath getPrintingUnitWebPath() {
        return printingUnitWebPath;
    }

    /**
     * Sets the value of the printingUnitWebPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionSubPath }
     *     
     */
    public void setPrintingUnitWebPath(ProductionSubPath value) {
        this.printingUnitWebPath = value;
    }

    /**
     * Gets the value of the productionPathID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionPathID() {
        return productionPathID;
    }

    /**
     * Sets the value of the productionPathID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionPathID(String value) {
        this.productionPathID = value;
    }

}
