
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CylinderLayoutPreparationParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CylinderLayoutPreparationParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ProductionPath" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CylinderLayoutPreparationParams", propOrder = {
    "productionPath"
})
public class CylinderLayoutPreparationParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ProductionPath")
    protected List<ProductionPath> productionPath;

    /**
     * Gets the value of the productionPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionPath }
     * 
     * 
     */
    public List<ProductionPath> getProductionPath() {
        if (productionPath == null) {
            productionPath = new ArrayList<ProductionPath>();
        }
        return this.productionPath;
    }

}
