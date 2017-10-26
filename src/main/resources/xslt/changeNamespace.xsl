<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output indent="yes"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="@*|text()|comment()|processing-instruction()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

<!-- Rebuild namespaces for root element -->
    <xsl:template match="/*">
        <xsl:element name="{name()}" namespace="http://example.com/Person/">
<!--         Add extra namespaces here, as following: -->
<!--         <xsl:namespace name="xsi" select="'http://www.w3.org/2001/XMLSchema-instance'"/> -->
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>

	<xsl:template match="*">
        <xsl:element name="{name()}">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>