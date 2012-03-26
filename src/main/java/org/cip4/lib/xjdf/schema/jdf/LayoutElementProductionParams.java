
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutElementProductionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutElementProductionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeDef" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}LayoutElementPart" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LayoutElementProductionParams", propOrder = {
    "layoutElementParts",
    "actionPools",
    "testPools",
    "shapeDeves"
})
public class LayoutElementProductionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "LayoutElementPart")
    protected List<LayoutElementPart> layoutElementParts;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPools;
    @XmlElement(name = "TestPool")
    protected List<TestPool> testPools;
    @XmlElement(name = "ShapeDef")
    protected List<ShapeDef> shapeDeves;

    /**
     * Gets the value of the layoutElementParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutElementParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutElementParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutElementPart }
     * 
     * 
     */
    public List<LayoutElementPart> getLayoutElementParts() {
        if (layoutElementParts == null) {
            layoutElementParts = new ArrayList<LayoutElementPart>();
        }
        return this.layoutElementParts;
    }

    /**
     * Gets the value of the actionPools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionPool }
     * 
     * 
     */
    public List<ActionPool> getActionPools() {
        if (actionPools == null) {
            actionPools = new ArrayList<ActionPool>();
        }
        return this.actionPools;
    }

    /**
     * Gets the value of the testPools property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPools property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPools().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPool }
     * 
     * 
     */
    public List<TestPool> getTestPools() {
        if (testPools == null) {
            testPools = new ArrayList<TestPool>();
        }
        return this.testPools;
    }

    /**
     * Gets the value of the shapeDeves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeDeves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeDeves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeDef }
     * 
     * 
     */
    public List<ShapeDef> getShapeDeves() {
        if (shapeDeves == null) {
            shapeDeves = new ArrayList<ShapeDef>();
        }
        return this.shapeDeves;
    }

}
