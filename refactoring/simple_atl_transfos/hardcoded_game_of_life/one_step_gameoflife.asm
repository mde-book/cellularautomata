<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="gameoflife_step"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchcopyUniverse():V"/>
		<constant value="A.__matchcopyDeadCell():V"/>
		<constant value="A.__matchcopyLiveCell():V"/>
		<constant value="__exec__"/>
		<constant value="copyUniverse"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applycopyUniverse(NTransientLink;):V"/>
		<constant value="copyDeadCell"/>
		<constant value="A.__applycopyDeadCell(NTransientLink;):V"/>
		<constant value="copyLiveCell"/>
		<constant value="A.__applycopyLiveCell(NTransientLink;):V"/>
		<constant value="__matchcopyUniverse"/>
		<constant value="Universe"/>
		<constant value="CURRENT"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="NEXTSTEP"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:7-11:4"/>
		<constant value="__applycopyUniverse"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="cells"/>
		<constant value="10:13-10:14"/>
		<constant value="10:13-10:20"/>
		<constant value="10:4-10:20"/>
		<constant value="link"/>
		<constant value="__matchcopyDeadCell"/>
		<constant value="Cell"/>
		<constant value="val"/>
		<constant value="0"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="33"/>
		<constant value="15:25-15:26"/>
		<constant value="15:25-15:30"/>
		<constant value="15:33-15:34"/>
		<constant value="15:25-15:34"/>
		<constant value="16:7-19:4"/>
		<constant value="__applycopyDeadCell"/>
		<constant value="neighbors"/>
		<constant value="4"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.sum():J"/>
		<constant value="28"/>
		<constant value="29"/>
		<constant value="17:14-17:15"/>
		<constant value="17:14-17:25"/>
		<constant value="17:39-17:40"/>
		<constant value="17:39-17:44"/>
		<constant value="17:14-17:45"/>
		<constant value="17:14-17:52"/>
		<constant value="17:55-17:56"/>
		<constant value="17:14-17:56"/>
		<constant value="17:70-17:71"/>
		<constant value="17:63-17:64"/>
		<constant value="17:11-17:77"/>
		<constant value="17:4-17:77"/>
		<constant value="18:17-18:18"/>
		<constant value="18:17-18:28"/>
		<constant value="18:4-18:28"/>
		<constant value="n"/>
		<constant value="__matchcopyLiveCell"/>
		<constant value="23:25-23:26"/>
		<constant value="23:25-23:30"/>
		<constant value="23:33-23:34"/>
		<constant value="23:25-23:34"/>
		<constant value="24:7-28:4"/>
		<constant value="__applycopyLiveCell"/>
		<constant value="J.or(J):J"/>
		<constant value="43"/>
		<constant value="44"/>
		<constant value="25:14-25:15"/>
		<constant value="25:14-25:25"/>
		<constant value="25:39-25:40"/>
		<constant value="25:39-25:44"/>
		<constant value="25:14-25:45"/>
		<constant value="25:14-25:52"/>
		<constant value="25:55-25:56"/>
		<constant value="25:14-25:56"/>
		<constant value="26:11-26:12"/>
		<constant value="26:11-26:22"/>
		<constant value="26:36-26:37"/>
		<constant value="26:36-26:41"/>
		<constant value="26:11-26:42"/>
		<constant value="26:11-26:49"/>
		<constant value="26:52-26:53"/>
		<constant value="26:11-26:53"/>
		<constant value="25:14-26:53"/>
		<constant value="26:67-26:68"/>
		<constant value="26:60-26:61"/>
		<constant value="25:11-26:74"/>
		<constant value="25:4-26:74"/>
		<constant value="27:17-27:18"/>
		<constant value="27:17-27:28"/>
		<constant value="27:4-27:28"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="52"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="70"/>
			<call arg="30"/>
			<set arg="70"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="71" begin="11" end="11"/>
			<lne id="72" begin="11" end="12"/>
			<lne id="73" begin="9" end="14"/>
			<lne id="64" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="15"/>
			<lve slot="2" name="58" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="74" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="75">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="76"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="77"/>
			<pushi arg="78"/>
			<call arg="79"/>
			<call arg="80"/>
			<if arg="81"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="76"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="82" begin="7" end="7"/>
			<lne id="83" begin="7" end="8"/>
			<lne id="84" begin="9" end="9"/>
			<lne id="85" begin="7" end="10"/>
			<lne id="86" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="87">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="88"/>
			<iterate/>
			<store arg="89"/>
			<load arg="89"/>
			<get arg="77"/>
			<call arg="90"/>
			<enditerate/>
			<call arg="91"/>
			<pushi arg="69"/>
			<call arg="79"/>
			<if arg="92"/>
			<pushi arg="78"/>
			<goto arg="93"/>
			<pushi arg="19"/>
			<call arg="30"/>
			<set arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="88"/>
			<call arg="30"/>
			<set arg="88"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="94" begin="14" end="14"/>
			<lne id="95" begin="14" end="15"/>
			<lne id="96" begin="18" end="18"/>
			<lne id="97" begin="18" end="19"/>
			<lne id="98" begin="11" end="21"/>
			<lne id="99" begin="11" end="22"/>
			<lne id="100" begin="23" end="23"/>
			<lne id="101" begin="11" end="24"/>
			<lne id="102" begin="26" end="26"/>
			<lne id="103" begin="28" end="28"/>
			<lne id="104" begin="11" end="28"/>
			<lne id="105" begin="9" end="30"/>
			<lne id="106" begin="33" end="33"/>
			<lne id="107" begin="33" end="34"/>
			<lne id="108" begin="31" end="36"/>
			<lne id="86" begin="8" end="37"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="109" begin="17" end="20"/>
			<lve slot="3" name="60" begin="7" end="37"/>
			<lve slot="2" name="58" begin="3" end="37"/>
			<lve slot="0" name="17" begin="0" end="37"/>
			<lve slot="1" name="74" begin="0" end="37"/>
		</localvariabletable>
	</operation>
	<operation name="110">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="76"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="77"/>
			<pushi arg="19"/>
			<call arg="79"/>
			<call arg="80"/>
			<if arg="81"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="76"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="111" begin="7" end="7"/>
			<lne id="112" begin="7" end="8"/>
			<lne id="113" begin="9" end="9"/>
			<lne id="114" begin="7" end="10"/>
			<lne id="115" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="88"/>
			<iterate/>
			<store arg="89"/>
			<load arg="89"/>
			<get arg="77"/>
			<call arg="90"/>
			<enditerate/>
			<call arg="91"/>
			<pushi arg="29"/>
			<call arg="79"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="88"/>
			<iterate/>
			<store arg="89"/>
			<load arg="89"/>
			<get arg="77"/>
			<call arg="90"/>
			<enditerate/>
			<call arg="91"/>
			<pushi arg="69"/>
			<call arg="79"/>
			<call arg="117"/>
			<if arg="118"/>
			<pushi arg="78"/>
			<goto arg="119"/>
			<pushi arg="19"/>
			<call arg="30"/>
			<set arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="88"/>
			<call arg="30"/>
			<set arg="88"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="120" begin="14" end="14"/>
			<lne id="121" begin="14" end="15"/>
			<lne id="122" begin="18" end="18"/>
			<lne id="123" begin="18" end="19"/>
			<lne id="124" begin="11" end="21"/>
			<lne id="125" begin="11" end="22"/>
			<lne id="126" begin="23" end="23"/>
			<lne id="127" begin="11" end="24"/>
			<lne id="128" begin="28" end="28"/>
			<lne id="129" begin="28" end="29"/>
			<lne id="130" begin="32" end="32"/>
			<lne id="131" begin="32" end="33"/>
			<lne id="132" begin="25" end="35"/>
			<lne id="133" begin="25" end="36"/>
			<lne id="134" begin="37" end="37"/>
			<lne id="135" begin="25" end="38"/>
			<lne id="136" begin="11" end="39"/>
			<lne id="137" begin="41" end="41"/>
			<lne id="138" begin="43" end="43"/>
			<lne id="139" begin="11" end="43"/>
			<lne id="140" begin="9" end="45"/>
			<lne id="141" begin="48" end="48"/>
			<lne id="142" begin="48" end="49"/>
			<lne id="143" begin="46" end="51"/>
			<lne id="115" begin="8" end="52"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="109" begin="17" end="20"/>
			<lve slot="4" name="109" begin="31" end="34"/>
			<lve slot="3" name="60" begin="7" end="52"/>
			<lve slot="2" name="58" begin="3" end="52"/>
			<lve slot="0" name="17" begin="0" end="52"/>
			<lve slot="1" name="74" begin="0" end="52"/>
		</localvariabletable>
	</operation>
</asm>
