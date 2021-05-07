package data;

import model.Template_Model;

import java.util.ArrayList;

public class Template_data {

    public ArrayList<Template_Model> get_data_template(){
        ArrayList<Template_Model> template_Arr =new ArrayList<Template_Model>();

        //Шаблон1
        String name1="Заявление об аннулировании охотничьего билета единого федерального образца.";
        String spec1="Стандартное заявление";
        String codeName1="annul_ohot_bilet";
        String css1="";
        String htmlCode1="";
        String allHtml1="<#import 'receipt_statics.ftl' as receiptStatics/>\n" +
                "<style>\n" +
                "table{\n" +
                "\tfont-family:'Times New Roman', Times, serif;\n" +
                "\tfont-size:16px;\n" +
                "}\n" +
                "</style>\n" +
                "<#if form.additionalRequesters?has_content> <#assign index = 0/> <#list form.additionalRequesters as requester> <#assign index = index + 1/>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td width=\"50%\">\n" +
                "\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.combobox_1 == \"Кемерово город - Бойко Е.В.\">\n" +
                "\t\t\t\tНачальнику департамента по охране объектов животного мира Кузбасса \n" +
                "\t\t\t\t<br>\n" +
                "\t\t\t\tЕ.В.  Бойко\n" +
                "\t\t\t<#else>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<br>\n" +
                "\t\t\t\t<#switch form.combobox_1>\n" +
                "\t\t\t\t\t<#case \"Кемерово город - Бойко Е.В.\">\n" +
                "\t\t\t\t\t\tЕ.В.  Бойко\n" +
                "\t\t\t\t\t<#break>\n" +
                "\t\t\t\t\t<#default>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t</#switch>\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td colspan=2 align=\"center\">\n" +
                "\t\t\t<br>\n" +
                "\t\t\t<h3>\n" +
                "\t\t\t\t<#if form.combobox_0 == \"Аннулирование охотничего билета\">\n" +
                "\t\t\t\t\tЗаявление об аннулировании охотничьего билета единого федерального образца.\n" +
                "\t\t\t\t<#else>\n" +
                "\t\t\t\t\tЗаявление<br>\n" +
                "\t\t\t\t\tо получении охотничьего билета единого федерального образца.\n" +
                "\t\t\t\t</#if>\n" +
                "\t\t\t</h3>\n" +
                "\t\t\t<br>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t1. Ф.И.О.\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.PersonLastName!\"\"} ${requester.PersonName!\"\"} ${requester.PersonMiddleName!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t2. Число, месяц, год рождения\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.DateOfBirth!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t3.Место рождения\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.birthPlace!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t4. Место жительства\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.residenceAddress!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t5. Номер контактного телефона\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.mobilePhone!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t6. Адрес эл.почты(при наличии)\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t ${requester.email!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t7. Место работы, должность, адрес организации\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${form.textfield_0!\"\"}, ${form.textfield_1!\"\"}, ${form.textfield_2!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<#if form.combobox_0 == \"Аннулирование охотничего билета\">\n" +
                "\t<!-- Заявление об аннулировании охотничьего билета единого федерального образца. -->\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tПрошу аннулировать охотничий билет единого федерального образца в связи с \n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${form.textfield_6!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table>\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tСерия\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" align=\"left\">\n" +
                "\t\t\t${form.textfield_3!\"\"}\n" +
                "\t\t</td>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t№\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" align=\"left\">\n" +
                "\t\t\t${form.textfield_4!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tКем выдан:\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${form.textfield_5!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tДата выдачи:\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${form.datefield_0!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<br><br>\n" +
                "<table align=\"center\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" style=\"border-bottom: 1px solid black;\" width=\"200\">\n" +
                "\t\t\t${cDate?string('dd.MM.yyyy')} г. ${utils.toTextDate(cDate)?lower_case} ${cDate?string(\"HH\")}:${cDate?string(\"mm\")}\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"200\">\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" style=\"border-bottom: 1px solid black;\" width=\"200\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t(подпись)\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<p>\n" +
                "\n" +
                "\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\t\n" +
                "<#else>\n" +
                "\t<!-- Заявление о получении охотничьего билета единого федерального образца.-->\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tПрошу выдать мне охотничий билет единого федерального образца.<br>\n" +
                "\t\t\tС требованиями охотминимума ознакомлен.<br>\n" +
                "\t\t\tНепогашенной или неснятой судимости за совершений умышленного преступления не имею.  <br>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<b>Документ, удостоверяющий личность:</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table>\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tСерия \n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" align=\"left\">\n" +
                "\t\t\t${requester.PassportSeries!\"\"}\n" +
                "\t\t</td>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\t№\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" align=\"left\">\n" +
                "\t\t\t${requester.PassportNumber!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tКем выдан:\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.IssuingAuthority!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td nowrap>\n" +
                "\t\t\tДата выдачи:\n" +
                "\t\t</td>\n" +
                "\t\t<td style=\"border-bottom: 1px solid black;\" width=\"100%\" align=\"left\">\n" +
                "\t\t\t${requester.IssuingDate!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<b>Приложения:</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t1. 2 личные фотографии <br>\n" +
                "\t\t\t2. Копия основного документа, удостоверяющего личность на <u>${cpguUtils.getPageCount('fileuploadpanel_2',form)!' '}</u> листах. <br><br>\n" +
                "\t\t\t<span style=\"font-size: 14px;\">Настоящим даю свое согласие Департаменту по охране объектов животного мира Кемеровской области г. Кемерово пр. Кузнецкий 22А на проверку и обработку моих персональных данных (указанных в заявлении, а также паспортных данных и фотографии) путем сбора, систематизации, накопления, хранения, использования, передачи, обезличивания, а также на уточнение (обоснованное  изменение), блокирование, уничтожение и осуществление иных действий с моими персональными данными в соответствии с   действующим законодательством как ручным, так и автоматизированным способами  в целях ведения государственного охотхозяйственного реестра в соответствии со ст. 37, ст. 21 Федерального закона от 24.07.2009 № 209-ФЗ и Федеральным законом от 27.07.2006 № 152-ФЗ. Сроки хранения и порядок отзыва согласия устанавливаются согласно законодательству РФ.</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<br><br>\n" +
                "<table align=\"center\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" style=\"border-bottom: 1px solid black;\" width=\"200\">\n" +
                "\t\t\t${cDate?string('dd.MM.yyyy')} г. ${utils.toTextDate(cDate)?lower_case} ${cDate?string(\"HH\")}:${cDate?string(\"mm\")}\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"200\">\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" style=\"border-bottom: 1px solid black;\" width=\"200\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t(подпись)\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<p>\n" +
                "\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "</#if>\n" +
                "\n" +
                "\n" +
                "</#list></#if>";
        template_Arr.add(new Template_Model(name1,spec1,codeName1,allHtml1));

        //Шаблон 2
        String name2="Запрос о предоставлении нескольких государственных\n" +
                "и (или) муниципальных услуг в многофункциональных центрах\n" +
                "предоставления государственных и муниципальных услуг";
        String spec2="Несколько таблиц с документами";
        String codeName2="gos_uslug_centr";
        String css2="<#import 'receipt_statics.ftl' as receiptStatics/> <#import \"/packages/packageUtils.ftl\" as packageUtils><#assign orderForm = jsonMapper.readValue(order.getOrderString())/><#assign orderDocuments = packageUtils.getDocuments(orderForm)/> <#assign count=0/>\n" +
                "\n" +
                "<style>\n" +
                "table{\n" +
                "\tfont-family:'Times New Roman', Times, serif;\n" +
                "\tfont-size:16px;\n" +
                "}\n" +
                ".under_text{\n" +
                "\tfont-style:italic; \n" +
                "\tfont-size:10px;\n" +
                "}\n" +
                ".under_line{\n" +
                "\tborder-bottom: 1px solid black;\n" +
                "}\n" +
                ".rect_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\twidth: 25px;\n" +
                "\theight: 25px;\n" +
                "\tfont-size:20px;\n" +
                "}\n" +
                ".table_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tborder-collapse: collapse;\n" +
                "}\n" +
                ".table_bordered td,th{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tpadding:3px;\n" +
                "}\n" +
                "@page{\n" +
                "\tmargin: 0.5cm 1cm 0.5cm 1cm; \n" +
                " }\n" +
                " @page : first {\n" +
                "\tmargin: 1cm;\n" +
                "}\n" +
                "</style>";
        String htmlCode2="<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<br />\n" +
                "\t\t\t<h3>\n" +
                "\t\t\t\tЗапрос о предоставлении нескольких государственных<br />\n" +
                "\t\t\t\tи (или) муниципальных услуг в многофункциональных центрах<br />\n" +
                "\t\t\t\tпредоставления государственных и муниципальных услуг<sup>1</sup>\n" +
                "\t\t\t</h3>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\" class=\"table_bordered\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\" width=\"5%\">\n" +
                "\t\t\t<b>№ п/п</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" width=\"25%\">\n" +
                "\t\t\t<b>Формат данных</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" width=\"70%\">\n" +
                "\t\t\t<b>Информация</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" colspan=2>\n" +
                "\t\t\t<b>Сведения о заявителе - физическом лице, в том числе индивидуальном предпринимателе</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t1.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tФамилия, имя, отчество (при наличии), дата и место рождения\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.requesterType != \"COMPANY\">\n" +
                "\t\t\t\t${order.requester.displayName!\"\"} ${order.requester.birthDate!\"\"} г. ${order.requester.birthPlace!\"\"}\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t2.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tДокумент, удостоверяющий личность (наименование и реквизиты)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.requesterType != \"COMPANY\">\n" +
                "\t\t\t\t${order.requester.document.documentType.identityDocumentName!\"\"} ${order.requester.document.series!\"\"} ${order.requester.document.number!\"\"} ${order.requester.document.authority!\"\"} ${order.requester.document.dateOfIssue!\"\"} г.\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t3.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tАдрес регистрации по месту жительства (месту пребывания)\n" +
                "\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${order.requester.registrationAddress!\"\"} \n" +
                "\t\t\t<#if order.requester.residenceAddress?has_content>\n" +
                "\t\t\t\t, ${order.requester.residenceAddress!\"\"}\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t4.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tИдентификационный номер налогоплательщика (ИНН)<sup>2</sup>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.requesterType != \"COMPANY\">\n" +
                "\t\t\t\t<#if order.requester.getInn()?has_content>\n" +
                "\t\t\t\t\t${order.requester.getInn()!\"\"}\n" +
                "\t\t\t\t<#else>\n" +
                "\t\t\t\t\t${form.textfield_2!\"\"}\n" +
                "\t\t\t\t</#if>\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t5.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tСтраховой номер индивидуального лицевого счета (СНИЛС)<sup>2</sup>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${order.requester.snils!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t6.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tОсновной государственный регистрационный номер индивидуального предпринимателя (ОГРНИП)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${form.additionalRequesters[0].OgrnIp}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" colspan=2>\n" +
                "\t\t\t<b>Сведения о заявителе - юридическом лице</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t1.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tНаименование юридического лица\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" style=\"padding:0px;\">\n" +
                "\t\t\t<table align=\"left\" width=\"100%\" style=\"border-spacing: 0px; border-collapse: collapse; border: 2px solid white\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td width=\"40%\">\n" +
                "\t\t\t\t\t\tПолное наименование\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td width=\"60%\">\n" +
                "\t\t\t\t\t\tСокращенное наименование (при наличии)\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td width=\"40%\">\n" +
                "\t\t\t\t\t\t${form.additionalRequesters[0].NameUl}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td width=\"60%\">\n" +
                "\t\t\t\t\t\t${form.additionalRequesters[0].ShortNameUl}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t2.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tАдрес места нахождения юридического лица \n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${form.additionalRequesters[0].legalAddress!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t3.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tОсновной государственный регистрационный номер(ОГРН)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${form.additionalRequesters[0].OgrnUl}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" colspan=2>\n" +
                "\t\t\t<b>Сведения о представителе заявителя</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t1.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tФамилия, имя, отчество (при наличии)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${form.additionalRequesters[0].declarant_representative_lastName!\"\"} ${form.additionalRequesters[0].declarant_representative_firstName!\"\"} ${form.additionalRequesters[0].declarant_representative_patronymic!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t2.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tДокумент, удостоверяющий личность (наименование документа и реквизиты документа)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.additionalRequesters[0].representative_check??> \n" +
                "\t\t\t\t${receiptStatics.declarantDocumentTypes[form.additionalRequesters[0].declarant_representative_documentType!'NULL']} ${form.additionalRequesters[0].declarant_representative_documentSeries!\"\"} ${form.additionalRequesters[0].declarant_representative_documentNumber!\"\"} ${form.additionalRequesters[0].declarant_representative_documentAuthority!\"\"} ${form.additionalRequesters[0].declarant_representative_dateOfIssue!\"\"}\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t3.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tДокумент, подтверждающий полномочия представителя заявителя (наименование документа и реквизиты документа)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<#if form.additionalRequesters[0].representative_check??> \n" +
                "\t\t\t\t${form.additionalRequesters[0].declarant_representative_warrant_name} ${form.additionalRequesters[0].declarant_representative_warrant_number} ${form.additionalRequesters[0].declarant_representative_warrant_authority} ${form.additionalRequesters[0].declarant_representative_warrant_date}</font>\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t4.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tНаименование юридического лица\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" style=\"padding:0px;\">\n" +
                "\t\t\t<table align=\"left\" width=\"100%\" style=\"border-spacing: 0px; border-collapse: collapse; border: 2px solid white\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td width=\"40%\">\n" +
                "\t\t\t\t\t\tПолное наименование\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td width=\"60%\">\n" +
                "\t\t\t\t\t\tСокращенное наименование (при наличии)\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td width=\"40%\">\n" +
                "\t\t\t\t\t\t${form.additionalRequesters[0].NameUl}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td width=\"60%\">\n" +
                "\t\t\t\t\t\t${form.additionalRequesters[0].ShortNameUl}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t5.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tАдрес места нахождения юридического лица\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t6.\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\tОсновной государственный регистрационный номер (ОГРН)\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t${form.additionalRequesters[0].OgrnUl}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<br>\n" +
                "\n" +
                "<table width=\"100%\" class=\"table_bordered\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\" width=\"5%\" rowspan=2>\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" width=\"25%\" rowspan=2>\n" +
                "\t\t\t<b>Наименование государственной и (или) муниципальной услуги <sup>3</sup></b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" width=\"70%\" colspan=2>\n" +
                "\t\t\t<b>Информация о государственной и (или) муниципальной услуге</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\" width=\"40%\">\n" +
                "\t\t\t<b>Последовательность предоставления услуг <sup>4</sup></b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"left\" width=\"30%\">\n" +
                "\t\t\t<b>Подпись заявителя о досрочном получении результата <sup>5</sup></b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<#list form.cloneablePanel_0 as clone>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t<#if form.cloneablePanel_0?size gt 1>${clone_index+1}. </#if>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t${clone.combobox_c0!''}\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t${clone.combobox_2!''}\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\n" +
                "\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t</#list>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<b>Иные сведения <sup>6</sup></b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<#assign x=form.textarea_0> \n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t<#if x?length gt 80>\n" +
                "\t\t\t\t<#assign x1=x?substring(80)>\n" +
                "\t\t\t\t${x?substring(0,80)}${x1?keep_before(\" \")}\n" +
                "\t\t\t\t<#assign x2=x1?keep_after(\" \")> \n" +
                "\t\t\t<#else>\n" +
                "\t\t\t\t${x}\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t<#if x?length gt 80>\n" +
                "\t\t\t\t${x2}\n" +
                "\t\t\t</#if>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\">\n" +
                "\t\t\tВ соответствии с пунктом 2.1 частью 1 статьи 16 Федерального закона от 27 июля 2010 г. № 210-ФЗ «Об организации предоставления государственных и муниципальных услуг» подтверждаю полномочия\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t${order.mfc.getFullName()!\"\"}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(название многофункционального центра предоставления государственных и (или) муниципальных услуг)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\">\n" +
                "\t\t\tдействовать от моего имени в целях организации предоставления государственных (муниципальных) услуг, а именно составлять на основании комплексного запроса о предоставлении нескольких государственных и (или) муниципальных услуг в многофункциональных центрах предоставления государственных и муниципальных услуг (далее - комплексный запрос) заявления на предоставление конкретных государственных и (или) муниципальных услуг, указанных в комплексном запросе, подписывать такие заявления и скреплять их печатью многофункционального центра, формировать комплекты документов, необходимых для получения государственных и (или) муниципальных услуг, указанных в комплексном запросе, направлять указанные заявления и комплекты документов в органы, предоставляющие государственные услуги, и органы, предоставляющие муниципальные услуги.\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table align=\"center\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" class=\"under_line\" width=\"200\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"50\">\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"300\">\n" +
                "\t\t\t<table>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td>«</td>\n" +
                "\t\t\t\t\t<td class=\"under_line\" width=\"30px\" align=\"center\"> ${cDate?string(\"dd\")!\"\"} </td>\n" +
                "\t\t\t\t\t<td>»</td>\n" +
                "\t\t\t\t\t<td width=\"5px\"></td>\n" +
                "\t\t\t\t\t<td class=\"under_line\" width=\"150px\" align=\"center\"> ${cDate?string(\"MMMM\")!\"\"} </td>\n" +
                "\t\t\t\t\t<td width=\"5px\"></td>\n" +
                "\t\t\t\t\t<td class=\"under_line\" width=\"50px\" align=\"center\"> ${cDate?string(\"yyyy\")!\"\"} </td>\n" +
                "\t\t\t\t\t<td>г.</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(подпись заявителя)</span>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(дата)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\">\n" +
                "\t\t\t<b>Настоящим подтверждаю, что сведения, указанные в настоящем комплексном запросе, на дату представления комплексного запроса достоверны.</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t${order.requester.displayName!\"\"} \n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(фамилия, имя, отчество (при наличии) и подпись заявителя)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<b>Информация о приеме документов</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\" class=\"table_bordered\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" rowspan=2 width=\"5%\">\n" +
                "\t\t\t<b>№ п/п</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" rowspan=2 width=\"20%\">\n" +
                "\t\t\t<b>Наименование документа</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" rowspan=2 width=\"15%\">\n" +
                "\t\t\t<b>Реквизиты документа</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" colspan=2 width=\"30%\">\n" +
                "\t\t\t<b>Оригинал</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" colspan=2 width=\"30%\">\n" +
                "\t\t\t<b>Копия</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t<b>Количество экземпляров</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t<b>Количество листов</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t<b>Количество экземпляров</b>\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t<b>Количество листов</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<#assign x=0>\n" +
                "\t<#list form?keys as key>\n" +
                "\t\t<#if key?ends_with(\"_documentProvided\") && form[key?replace(\"_documentProvided\", \"_document\")]?has_content && form[key]?has_content && form[key]==\"on\">\n" +
                "\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")]?ends_with(\":\")>\n" +
                "\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")]?replace(\":\",\"\") != \"Заявление\">\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t${x+1}\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_document\")]}\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_docRequisites\")]}\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t</#if>\n" +
                "\t\t\t\t<#else>\n" +
                "\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")] != \"Заявление\">\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${x+1}\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_document\")]}\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_docRequisites\")]}\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t</#if>\n" +
                "\t\t\t\t</#if>\n" +
                "\t\t\t<#assign x=x+1>\n" +
                "\t\t</#if>\n" +
                "\t</#list>\n" +
                "\t<#list form?keys as fieldName>\n" +
                "\t\t<#if fieldName == \"default_document\" && form[fieldName]?has_content && form[fieldName]?is_sequence>\n" +
                "\t\t\t<#list form[fieldName] as document>\n" +
                "\t\t\t\t<#if document?is_hash>\n" +
                "\t\t\t\t\t<#list document?keys as fileField>\n" +
                "\t\t\t\t\t\t<#if fileField?ends_with(\"_documentProvided\") && document[fileField]?has_content>\n" +
                "\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${x+1}\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_document\")]} \n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_docRequisites\")]} \n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if document[fileField?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if document[fileField?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Оригинал\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if document[fileField?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_exemplarCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<#if document[fileField?replace(\"_documentProvided\", \"_documentCharacterName\")] == \"Копия\">\n" +
                "\t\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_pageCount\")]}\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t<#assign x=x+1>\n" +
                "\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t</#list>\n" +
                "\t\t\t\t</#if>\n" +
                "\t\t\t</#list>\n" +
                "\t\t</#if>\n" +
                "\t</#list>\n" +
                "</table>\n" +
                "<br>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\">\n" +
                "\t\t\t<b>Общий срок выполнения комплексного запроса не позднее</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<#assign aDate = form.datefield_0?date>\n" +
                "<table>\n" +
                "\t<tr>\n" +
                "\t\t<td>«</td>\n" +
                "\t\t<td class=\"under_line\" width=\"30px\" align=\"center\"> ${aDate?string(\"dd\")!\"\"} </td>\n" +
                "\t\t<td>»</td>\n" +
                "\t\t<td width=\"5px\"></td>\n" +
                "\t\t<td class=\"under_line\" width=\"150px\" align=\"center\"> ${aDate?string(\"MMMM\")!\"\"} </td>\n" +
                "\t\t<td width=\"5px\"></td>\n" +
                "\t\t<td class=\"under_line\" width=\"50px\" align=\"center\"> ${aDate?string(\"yyyy\")!\"\"} </td>\n" +
                "\t\t<td>г.</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" colspan=8>\n" +
                "\t\t\t<span class=\"under_text\">(дата выполнения комплексного запроса в полном объеме)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<br>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\">\n" +
                "\t\t\t<b>Документы (копии документов), необходимые для предоставления выбранных заявителем государственных и (или) муниципальных услуг, представлены заявителем в полном объеме</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table align=\"left\" width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t${order.getUser().getDisplayName()!}, ${order.getUser().getPosition()!}, ${cDate?string('dd.MM.yyyy')} \n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(фамилия, имя, отчество (при наличии), должность и подпись работника многофункционального центра предоставления государственных и муниципальных услуг, принявшего документы, дата приема)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\" colspan=2>\n" +
                "\t\t\t<b>Способ информирования заявителя (представителя заявителя) о результате предоставления государственных и (или) муниципальных услуг <sup>7</sup>:</b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" class=\"rect_bordered\">\n" +
                "\t\t\t<#if form.checkbox_0?has_content>V</#if>\n" +
                "\t\t</td>\n" +
                "\t\t<td>\n" +
                "\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td nowrap=\"nowrap\">\n" +
                "\t\t\t\t\t\tПо телефону\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td align=\"center\" class=\"under_line\" width=\"100%\"> \n" +
                "\t\t\t\t\t\t${form.textfield_0!}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td></td>\n" +
                "\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t<span class=\"under_text\">(номер телефона)</span>\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" class=\"rect_bordered\">\n" +
                "\t\t\t<#if form.checkbox_1?has_content>V</#if>\n" +
                "\t\t</td>\n" +
                "\t\t<td>\n" +
                "\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td nowrap=\"nowrap\">\n" +
                "\t\t\t\t\t\tПо электронной почте\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td align=\"center\" class=\"under_line\" width=\"100%\"> \n" +
                "\t\t\t\t\t\t${form.textfield_1!}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td></td>\n" +
                "\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t<span class=\"under_text\">(адрес электронной почты)</span>\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" class=\"rect_bordered\">\n" +
                "\t\t\t<#if form.checkbox_2?has_content>V</#if>\n" +
                "\t\t</td>\n" +
                "\t\t<td>\n" +
                "\t\t\tВ ходе личного обращения\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<br>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"justify\">\n" +
                "\t\t\t<b>Документы (копии документов), представленные заявителем совместно с комплексным запросом (за исключением документов (копий документов), не подлежащих возврату в соответствии с нормативными правовыми актами Российской Федерации), и документы, являющиеся результатом выполнения комплексного запроса, получены в многофункциональном центре предоставления государственных и муниципальных услуг в полном объеме <sup>8</sup></b>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table align=\"left\" width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"left\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\">\n" +
                "\t\t\t<span class=\"under_text\">(фамилия, имя, отчество (при наличии), подпись заявителя, дата получения результата выполнения комплексного запроса)</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td class=\"under_text\">\n" +
                "\t\t\t_____________________<br>\n" +
                "\t\t\t<sup>1</sup>Составляется при однократном обращении заявителя.<br>\n" +
                "\t\t\t<sup>2</sup> Указывается заявителем при желании.<br>\n" +
                "\t\t\t<sup>3</sup> Указываются государственные и (или) муниципальные услуги, которые желает получить заявитель.<br>\n" +
                "\t\t\t<sup>4</sup> Указывается последовательность предоставления государственных и (или) муниципальных услуг, перечисленных в разделе «Наименование государственной и (или) муниципальной услуги»:<br>\n" +
                "\t\t\t- первичная (предоставление государственной и (или) муниципальной услуги возможно без получения результатов иных государственных и (или) муниципальных услуг, указанных в разделе «Наименование государственной и (или) муниципальной услуги»);<br>\n" +
                "\t\t\t- по результату предоставления услуги «...» (в кавычках излагается наименование государственной и (или) муниципальной услуги, указанной в разделе «Наименование государственной и (или) муниципальной услуги», необходимой для предоставления выбранной государственной и (или) муниципальной услуги).<br>\n" +
                "\t\t\t<sup>5</sup> Подпись заявителя о досрочном получении результата предоставления государственной и (или) муниципальной услуги, указанной в разделе «Наименование государственной и (или) муниципальной услуги», до окончания общего срока выполнения комплексного запроса о предоставлении нескольких государственных и (или) муниципальных услуг в многофункциональных центрах предоставления государственных и муниципальных услуг.<br>\n" +
                "\t\t\t<sup>6</sup> Указываются иные необходимые для предоставления выбранных заявителем государственных и (или) муниципальных услуг сведения, содержащиеся в формах заявлений, предусмотренных нормативными правовыми актами Российской Федерации, регулирующими предоставление государственных и (или) муниципальных услуг, указанных в разделе «Наименование государственной и (или) муниципальной услуги».<br>\n" +
                "\t\t\t<sup>7</sup> Указывается один или несколько способов информирования.<br>\n" +
                "\t\t\t<sup>8</sup> Заполняется по итогам получения всех документов, являющихся результатом предоставления государственных и (или) муниципальных услуг, заявителем (представителем заявителя) лично в многофункциональном центре предоставления государственных и муниципальных услуг.<br>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>";
        String allHtml2=css2+htmlCode2;
        template_Arr.add(new Template_Model(name2,spec2,codeName2,allHtml2));

        //Шаблон3
        String name3="Постановка на учет граждан, нуждающиеся в помощи";
        String spec3="Шапка и обычный текст шаблона";
        String codeName3="postav_uchet";
        String css3="<#import 'receipt_statics.ftl' as receiptStatics/> \n" +
                "<#import \"/packages/packageUtils.ftl\" as packageUtils>\n" +
                "<#assign orderForm = jsonMapper.readValue(order.getOrderString())/>\n" +
                "<#assign orderDocuments = packageUtils.getDocuments(orderForm)/> \n" +
                "<#assign count=0/>\n" +
                "<style>\n" +
                "table{\n" +
                "\tfont-family:'Times New Roman', Times, serif;\n" +
                "\tfont-size:16px;\n" +
                "}\n" +
                ".under_text{\n" +
                "\tfont-style:italic; \n" +
                "\tfont-size:10px;\n" +
                "}\n" +
                ".under_line{\n" +
                "\tborder-bottom: 1px solid black;\n" +
                "}\n" +
                ".title_usl{\n" +
                "\ttext-align: center;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                ".text_usual{\n" +
                "\ttext-align: left;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 10px;\n" +
                "}\n" +
                ".time_usl{\n" +
                "\ttext-align: center;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 18px;\n" +
                "\tmargin-bottom: 40px;\n" +
                "}\n" +
                ".rect_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\twidth: 25px;\n" +
                "\theight: 25px;\n" +
                "\tfont-size:20px;\n" +
                "}\n" +
                ".table_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tborder-collapse: collapse;\n" +
                "}\n" +
                ".table_bordered td,th{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tpadding:3px;\n" +
                "}\n" +
                "@page{\n" +
                "\tmargin: 0.5cm 1cm 0.5cm 1cm; \n" +
                " }\n" +
                " @page : first {\n" +
                "\tmargin: 1cm;\n" +
                "}\n" +
                "</style>";
        String htmlCode3="<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" width=\"40%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td  width=\"60%\">\n" +
                "\t\t\tГлаве Березовского городского округа\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t\n" +
                "\t\t<td align=\"center\" width=\"40%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td  class=\"under_line\" width=\"60%\">\n" +
                "\t\t\t${form.textfield_0!''}\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" width=\"40%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"60%\">\n" +
                "\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td  width=\"5%\">\n" +
                "\t\t\t\t\t\tОт\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td  class=\"under_line\" width=\"95%\">\n" +
                "\t\t\t\t\t\t${form.lastName} ${form.firstName} ${form.patronymic}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "\t\n" +
                "\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" width=\"40%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"60%\">\n" +
                "\t\t\t<#assign x=form.registrationAddress> \n" +
                "\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td align=\"center\" nowrap>\n" +
                "\t\t\t\t\t\tпроживающего(ей) по адресу:  \n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td align=\"center\" class=\"under_line\" width=\"100%\">\n" +
                "\t\t\t\t\t\t<#if x?length gt 20>\n" +
                "\t\t\t\t\t\t\t<#assign x1=x?substring(20)>\n" +
                "\t\t\t\t\t\t\t${x?substring(0,20)}${x1?keep_before(\" \")}\n" +
                "\t\t\t\t\t\t\t<#assign x2=x1?keep_after(\" \")> \n" +
                "\t\t\t\t\t\t<#else>\n" +
                "\t\t\t\t\t\t\t${x}\n" +
                "\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td align=\"center\" class=\"under_line\" width=\"100%\" colspan=2>\n" +
                "\t\t\t\t\t\t<#if x?length gt 20>\n" +
                "\t\t\t\t\t\t\t${x2}\n" +
                "\t\t\t\t\t\t</#if>\n" +
                "\n" +
                "\t\t\t\t\t\t<#assign x1=\"\"> <#assign x=\"\"><#assign x2=\"\"><#assign x3=\"\"><#assign x4=\"\">\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" width=\"40%\">\n" +
                "\t\t\t\n" +
                "\t\t</td>\n" +
                "\t\t<td align=\"center\" width=\"60%\">\n" +
                "\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<td align=\"center\" width=\"7%\">\n" +
                "\t\t\t\t\t\tтел.:\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t<td align=\"center\" class=\"under_line\" width=\"93%\">\n" +
                "\t\t\t\t\t\t${form.mobilePhone!}\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t</table>\n" +
                "\t\t</td>\n" +
                "\t</tr>\t\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" colspan=\"2\">\n" +
                "\t\t\t<br />\n" +
                "\t\t\t\n" +
                "\t\t\tЗАЯВЛЕНИЕ<br><br>\n" +
                "\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<div class=\"text_usual\">\n" +
                "\t<span>\n" +
                "\t\tПрошу признать мою семью нуждающейся в улучшении жилищных условий для поставки на учет нуждающихся в улучшении жилищных условий и включить в реестр получателей долгосрочных целевых жилищных займов и социальных выплат в рамках Закона Кемеровской области от 16.05.2006 г. N 58-ОЗ \"О предоставлении долгосрочных целевых жилищных займов, социальных выплат и развитии ипотечного жилищного кредитования\" как\n" +
                "\t</span>\n" +
                "</div>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t<td align=\"center\" class=\"under_line\">\n" +
                "\t\t${form.textfield_1!''}\n" +
                "\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td class=\"under_text\" style=\"text-align: center;\">\n" +
                "\t\t\t<span>\n" +
                "\t\t\t\t(указать категорию)\n" +
                "\t\t\t</span>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "<div class=\"text_usual\">\n" +
                "\t<span>\n" +
                "\t\tСостав семьи:\n" +
                "\t</span>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<#assign x=form.textfield_2>\n" +
                "<table  style=\"width: 100%;\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t\t<td  class=\"under_line\" >\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<span >\n" +
                "\t\t\t\t\t<#if x?length gt 40>\n" +
                "\t\t\t\t<#assign x1=x?substring(40)>\n" +
                "\t\t\t\t${x?substring(0,40)}${x1?keep_before(\" \")}\n" +
                "\t\t\t\t<#assign x2=x1?keep_after(\" \")> \n" +
                "\t\t\t<#else>\n" +
                "\t\t\t\t${x}\n" +
                "\t\t\t</#if>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<br /></span>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<tr>\n" +
                "\t\t\n" +
                "\t\t\t<td  class=\"under_line\">\n" +
                "\t\t\t\t<span >\n" +
                "\t\t\t\t\t<#if x2?length gt 80>\n" +
                "\t\t\t\t<#assign x3=x2?substring(80)>\n" +
                "\t\t\t\t${x2?substring(0,80)}${x3?keep_before(\" \")}\n" +
                "\t\t\t\t<#assign x4=x3?keep_after(\" \")> \n" +
                "\t\t\t<#else>\n" +
                "\t\t\t\t${x2}\n" +
                "\t\t\t</#if>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<br /></span>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\n" +
                "\n" +
                "\t\t<tr>\n" +
                "\t\t\n" +
                "\t\t\t<td  class=\"under_line\" >\n" +
                "\t\t\t\t<span >\n" +
                "\t\t\t\t\t<#if x4?length gt 0>${x4}</#if>\n" +
                "\t\t\t<#assign x1=\"\"> <#assign x=\"\"><#assign x2=\"\"><#assign x3=\"\"><#assign x4=\"\">\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<br /></span>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t</tbody>\n" +
                "</table>\n" +
                "<br>\n" +
                "<div class=\"text_usual\">\n" +
                "\t<span>\n" +
                "\t\tЯ ознакомлен(а) с условиями предоставления долгосрочных целевых жилищных займов и социальных выплат, с перечнем оснований для отказа в предоставлении муниципальной услуги, в том числе разъяснены последствия предоставления неполного пакета документов.\n" +
                "\t</span>\n" +
                "</div>\n" +
                "\n" +
                "<table width=\"100%\">\n" +
                "\t<tr>\n" +
                "\t\t<td class=\"under_line\">\n" +
                "\t\t\t<br>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td class=\"under_line\">\n" +
                "\t\t\t<br>\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>";
        String allHtml3=css3+htmlCode3;
        template_Arr.add(new Template_Model(name3,spec3,codeName3,allHtml3));

        //Шаблон1
        String name4="Заявление\n" +
                "о предварительном согласовании предоставления земельного участка в границах\n" +
                "земель лесного фонда на территории Кемеровской области-Кузбасса";
        String spec4="В заявлении содержатся чекбоксы";
        String codeName4="semeln_uchastok";
        String css4="<#import 'receipt_statics.ftl' as receiptStatics/> <#import \"/packages/packageUtils.ftl\" as packageUtils><#assign orderForm = jsonMapper.readValue(order.getOrderString())/><#assign orderDocuments = packageUtils.getDocuments(orderForm)/> <#assign count=0/>\n" +
                "<style type=\"text/css\">\n" +
                "table, div {\n" +
                "        font-family: 'Times New Roman';\n" +
                "        padding: 0px;\n" +
                "        border-spacing: 0px;\n" +
                "        font-size: 16px;\n" +
                "    }\n" +
                "    .rect_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\twidth: 25px;\n" +
                "\theight: 25px;\n" +
                "\tfont-size:20px;\n" +
                "}\n" +
                "\n" +
                ".table_bordered{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tborder-collapse: collapse;\n" +
                "}\n" +
                ".table_bordered td,th{\n" +
                "\tborder: 1px solid black;\n" +
                "\tborder-spacing: 0px 0px;\n" +
                "\tpadding:3px;\n" +
                "}\n" +
                ".under_text{\n" +
                "\tfont-size:12px;font-family:Times New Roman;\n" +
                "}\n" +
                "\n" +
                ".under_line{\n" +
                "\tborder-bottom: 1px solid black; font-size:16px; font-family:Times New Roman;\n" +
                "}\n" +
                ".title_usl{\n" +
                "\ttext-align: center;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                ".text_usual{\n" +
                "\ttext-align: left;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                ".time_usl{\n" +
                "\ttext-align: center;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 18px;\n" +
                "\tmargin-bottom: 40px;\n" +
                "}\n" +
                ".v_soot_stat{\n" +
                "\ttext-align: left;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                ".podtvergden{\n" +
                "\ttext-align: left;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-top: 20px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                "\n" +
                ".m_p{\n" +
                "\ttext-align: left;\n" +
                "\tfont-family: 'Times New Roman';\n" +
                "    font-size: 16px;\n" +
                "\tmargin-bottom: 20px;\n" +
                "}\n" +
                "</style>";
        String htmlCode4="<table align=\"right\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 50%;\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td>\n" +
                "\t\t\t\t<table align=\"right\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%;\">\n" +
                "\t\t\t\t\t<tbody>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t<span >Начальнику территориального отдела<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t<span>по ${form.textfield_18!''} лесничеству\n" +
                "\t\t\t\t\t\t\t\t<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\">\n" +
                "\t\t\t\t\t\t\t\t<span>${form.textfield_19!''}\n" +
                "\t\t\t\t\t\t\t\t<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<td class=\"under_text\" style=\"text-align: center;\">\n" +
                "\t\t\t\t\t\t\t\t<span>(Ф.И.О.)\n" +
                "\t\t\t\t\t\t\t\t<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t</tbody>\n" +
                "\t\t\t\t</table>\n" +
                "\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t</tbody>\n" +
                "</table><br><br><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<br>\n" +
                "<div style=\"clear: both; font-weight: bold; text-align: center;\">\n" +
                " </div>\n" +
                "\n" +
                "<div class=\"title_usl\">\n" +
                "\t<b>Заявление <br>о предварительном согласовании предоставления земельного участка в границах <br> земель лесного фонда на территории Кемеровской области-Кузбасса</b>\n" +
                "</div>\n" +
                "\n" +
                "<table style=\"width: 100%;\">\n" +
                "\t<tbody>\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 8%;\">\n" +
                "\t\t\t\t\t\t\t\t<span >Вид использования <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\" style=\"width: 92%;\" >\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_0!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td  style=\"width: 8%;\">\t\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"text-align: center; width: 92%;\">\n" +
                "\t\t\t\t\t\t\t\t<span class=\"under_text\">(в соответствии со статьей 25 Лесного кодекса Российской Федерации)\n" +
                "\t\t\t\t\t\t\t\t<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td  class=\"under_line\" colspan=\"2\">\t\n" +
                "\t\t\t\t\t\t\t\t<br>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<table style=\"width: 100%;\">\n" +
                "\t<tbody>\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 15%;\">\n" +
                "\t\t\t\t\t\t\t\t<span >Цель использования земельного участка:  <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\" style=\"width: 85%;\" >\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_1!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td  style=\"width: 15%;\">\t\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"text-align: center; width: 85%;\">\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t</td>\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td  class=\"under_line\" colspan=\"2\">\t\n" +
                "\t\t\t\t\t\t\t\t<br>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "<div class=\".text_usual\">\n" +
                "\t<span>Основание предоставления земельного участка (из числа предусмотренных пунктом 2 статьи 39.6, пунктом 2 статьи 39.10 Земельного кодекса Российской Федерации): \n" +
                "\t\t<br /></span>\n" +
                "</div>\n" +
                "\n" +
                "<table style=\"width: 100%;\">\n" +
                "\t<tbody>\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\">\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_16!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_16!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "<div class=\".text_usual\">\n" +
                "\t<span>Вид права, на котором заявитель желает приобрести земельный участок:\n" +
                "\t\t<br /></span>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "<table style=\"width: 100%;\">\n" +
                "\t<tbody>\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td class=\"under_line\">\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_17!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "<table class=\"table_bordered\" style=\"width: 100%;\">\n" +
                "\t<tbody>\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td colspan=\"2\">\n" +
                "\t\t\t\t\t\t\t\t<span >1. Сведения о заявителе<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td colspan=\"2\">\n" +
                "\t\t\t\t\t\t\t\t<span >Для юридического лица<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.1. Полное и сокращенное наименование<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.additionalRequesters[0].NameUl}   &nbsp;  ${form.additionalRequesters[0].ShortNameUl}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.2. Организационно-правовая форма<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.additionalRequesters[0].IncorporationFormUl}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.3. ОГРН/ИНН/КПП<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.additionalRequesters[0].OgrnUl} &nbsp; ${form.additionalRequesters[0].InnUl} &nbsp; ${form.additionalRequesters[0].KppUl} <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.4. Реквизиты банковского счета<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_4!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.5. Местонахождение<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.additionalRequesters[0].legalAddress!\"\"}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.6. Почтовый адрес и адрес электронной почты<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.additionalRequesters[0].mailingAddress} &nbsp; ${form.additionalRequesters[0].EmailUl}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.7. Фамилия, имя и (при наличии) отчество представителя организации, уполномоченного действовать без доверенности<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span > ${form.textfield_5!''} <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.8. Должность представителя организации, уполномоченного действовать без доверенности<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_7!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td colspan=\"2\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >Для физического лица<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.1. Фамилия, имя и (при наличии) отчество заявителя<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.lastName!} ${form.firstName!} ${form.patronymic!}  <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.2. Местожительства<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.residenceAddress!}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.3. Данные документа, удостоверяющего личность заявителя, - для гражданина, в том числе являющегося индивидуальным предпринимателем<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${receiptStatics.declarantDocumentTypes[form.documentType!'NULL']} ${form.passportSeries!} ${form.passportNo!} ${form.dateOfIssue!} ${form.authority!}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.4. ОГРНИП/ИНН - для гражданина, являющегося индивидуальным предпринимателем<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_8!''} <br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.5. Почтовый адрес и адрес электронной почты<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.residenceAddress!} &nbsp; ${form.email!}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td colspan=\"2\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >Для лица, действующего на основании документа, подтверждающего полномочия действовать от имени заявителя<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.1. Фамилия, имя и (при наличии) отчество лица, действующего от имени физического или юридического лица<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_10!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >1.2. Данные документа, подтверждающего полномочия лица действовать от имени заявителя<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_11!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td colspan=\"2\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >2. Сведения о земельном участке<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >2.1. Кадастровый номер испрашиваемого земельного участка (в случае, если границы такого земельного участка подлежат уточнению в соответствии с Федеральным законом \"О государственной регистрации недвижимости\"<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_12!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >2.2. Кадастровый номер земельного участка или кадастровые номера земельных участков, из которых в соответствии с проектом межевания территории, со схемой расположения земельного участка или с проектной документацией лесных участков предусмотрено образование испрашиваемого земельного участка, в случае если сведения о таких земельных участках внесены в Единый государственный реестр недвижимости<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_13!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >3. Реквизиты решения об утверждении проекта межевания территории, если образование испрашиваемого земельного участка предусмотрено указанным проектом<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_14!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 80%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >4. Реквизиты решения об утверждении документа территориального планирования и (или) проекта планировки территории в случае, если земельный участок предоставляется для размещения объектов, предусмотренных указанным документом и (или) проектом<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t<td style=\"width: 20%;\">\t\n" +
                "\t\t\t\t\t\t\t\t<span >${form.textfield_15!''}<br /></span>\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<td  width=\"100%\" colspan=\"2\">\n" +
                "\t\t\t\t\t\t\t\t5. Перечень документов, прилагаемых к заявлению\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t<#assign x=0>\n" +
                "\t\t\t\t\t<#list form?keys as key>\n" +
                "\t\t\t\t\t\t<#if key?ends_with(\"_documentProvided\") && form[key?replace(\"_documentProvided\", \"_document\")]?has_content && form[key]?has_content && form[key]==\"on\">\n" +
                "\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")]?ends_with(\":\")>\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")]?replace(\":\",\"\") != \"Заявление\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_document\")]}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tV\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t<#else>\n" +
                "\t\t\t\t\t\t\t\t\t<#if form[key?replace(\"_documentProvided\", \"_document\")] != \"Заявление\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t${form[key?replace(\"_documentProvided\", \"_document\")]}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tV\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t<#assign x=x+1>\n" +
                "\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t</#list>\n" +
                "\t\t\t\t\t<#list form?keys as fieldName>\n" +
                "\t\t\t\t\t\t<#if fieldName == \"default_document\" && form[fieldName]?has_content && form[fieldName]?is_sequence>\n" +
                "\t\t\t\t\t\t\t<#list form[fieldName] as document>\n" +
                "\t\t\t\t\t\t\t\t<#if document?is_hash>\n" +
                "\t\t\t\t\t\t\t\t\t<#list document?keys as fileField>\n" +
                "\t\t\t\t\t\t\t\t\t\t<#if fileField?ends_with(\"_documentProvided\") && document[fileField]?has_content>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t${document[fileField?replace(\"_documentProvided\", \"_document\")]} \n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tV\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<#assign x=x+1>\n" +
                "\t\t\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t\t\t</#list>\n" +
                "\t\t\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t\t\t</#list>\n" +
                "\t\t\t\t\t\t</#if>\n" +
                "\t\t\t\t\t</#list>\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "\n" +
                "<div class=\".text_usual\">\n" +
                "\t<span>Способ получения решения по результатам рассмотрения заявления и прилагаемых документов (указать нужное):</span>\n" +
                "</div>\n" +
                "<br>\n" +
                "<table width=\"100%\">\n" +
                "\t<tbody>\n" +
                "\t<tr>\n" +
                "\t<td class=\"rect_bordered\" align=\"center\"><#if form.checkbox_0?has_content>V</#if></td>\n" +
                "\t<td>- лично (выдается оригинал документа);</td>\n" +
                "\t</tr>\n" +
                "\t</tbody>\n" +
                "\t</table><br>\n" +
                "<table width=\"100%\">\n" +
                "\t\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t<td class=\"rect_bordered\" align=\"center\"><#if form.checkbox_1?has_content>V</#if></td>\n" +
                "\t\t<td>- почтовой связью (высылается оригинал документа); <br>\n" +
                "\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "<table width=\"100%\">\n" +
                "\t<tbody>\n" +
                "\t<tr>\n" +
                "\t<td class=\"rect_bordered\" align=\"center\"><#if form.checkbox_2?has_content>V</#if></td>\n" +
                "\t<td>- электронной почтой (высылается скан-копия документа). <br>\n" +
                "\t</td>\n" +
                "\t</tr>\n" +
                "\n" +
                "</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "<table  style=\"width: 100%;\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t\t<td  style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<div class=\"under_line\">\n" +
                "\t\t\t\t\t<span ><br /></span>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<div class=\"under_line\">\n" +
                "\t\t\t\t\t<span ><br /></span>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</td>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<span class=\"under_text\">(подпись, М.П. (при наличии)\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t<br />\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<span class=\"under_text\">(расшифровка подписи)\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t<br />\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "<div class=\"text_usual\">\n" +
                "\t<span>\n" +
                "\t\t* Документ представляется по усмотрению заявителя.\n" +
                "\t</span>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"text_usual\">\n" +
                "\t<span>Зарегистрировано</span>\n" +
                "</div>\n" +
                "\n" +
                "<table  style=\"width: 100%;\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t\t<td  >\n" +
                "\t\t\t\t<div class=\"text_usual\">\n" +
                "\t\t\t\t\t<span >N ${order.getOrderNumber()} От \"${cDate?string(\"dd\")!''}\" ${cDate?string(\"MM\")!''} ${cDate?string(\"yyyy\")!''} г. <br /></span>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t</tbody>\n" +
                "</table><br>\n" +
                "\n" +
                "\n" +
                "<table  style=\"width: 100%;\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t\t<td  style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<div class=\"under_line\">\n" +
                "\t\t\t\t\t<span >${order.getUser().getDisplayName()!}<br /></span>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<div class=\"under_line\">\n" +
                "\t\t\t\t\t<span ><br /></span>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</td>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<span class=\"under_text\">(ФИО)\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t<br />\n" +
                "\t\t\t</td>\n" +
                "\t\t\t<td style=\"text-align: center; padding-right: 10px; width:50%;\">\n" +
                "\t\t\t\t<span class=\"under_text\">(подпись работника,\n" +
                "\t\t\t\t\tпринявшего заявление\n" +
                "\t\t\t\t\t)\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t<br />\n" +
                "\t\t\t</td>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t</tbody>\n" +
                "</table>\n" +
                "<div style=\"page-break-before:always;\">\n" +
                "</div>\n" +
                "<div class=\"title_usl\">\n" +
                "\t<b>Согласие<br> на обработку персональных данных</b>\n" +
                "</div>\n" +
                "<table width=\"100%\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tЯ, <u>${form.lastName!''} ${form.firstName!''} ${form.patronymic!''}</u></td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"left\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(Ф.И.О. физического лица - субъекта персональных данных полностью либо представителя субъекта персональных данных)</td>\n" +
                "\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\n" +
                "\t\t<td align=\"left\" class=\"under_line\" width=\"\">\n" +
                "\t\t\t<span style=\"font-size:16px;\"><span style=\"font-family:times new roman,times,serif;\">зарегистрирован(а) по адресу: ${form.registrationAddress!''}</span></span></td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t\n" +
                "\t\t<td align=\"center\" width=\"\">\n" +
                "\t\t\t<span style=\"font-size:16px;\"><span style=\"font-family:times new roman,times,serif;\"><span class=\"under_text\">(указывается адрес регистрации физического лица - субъекта персональных данных либо представителя субъекта персональных\n" +
                "данных;\n" +
                "реквизиты доверенности или иного документа, подтверждающего\n" +
                "полномочия представителя субъекта персональных данных) \n" +
                ")</span></span></span></td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tдокумент, удостоверяющий личность <u>${receiptStatics.declarantDocumentTypes[form.documentType!'NULL']} ${form.passportSeries!} ${form.passportNo!}\t${form.dateOfIssue!} ${form.authority!}</u></td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\n" +
                "\t\t<td align=\"center\" width=\"\">\n" +
                "\t\t\t<span style=\"font-size:16px;\"><span style=\"font-family:times new roman,times,serif;\"><span class=\"under_text\">(наименование документа, серия, номер, дата выдачи, наименование органа, выдавшего документ)\n" +
                "\n" +
                "</span></span></span></td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tв целях обеспечения предоставления государственной услуги в соответствии с Федеральным законом от 27.07.2010 N 210-ФЗ \"Об организации предоставления государственных и муниципальных услуг\", для регистрации субъекта персональных данных на Едином портале государственных и муниципальных услуг (функций) в соответствии с пунктом 4 статьи 6, статьей 9 Федерального закона от 27.07.2006 N 152-ФЗ \"О персональных данных\" даю согласие департаменту лесного комплекса Кемеровской области, находящемуся по адресу: 650036, Кемеровская область, г. Кемерово, ул. Мирная, д. 5, в том числе его территориальному отделу по <span class=\"under_line\"> ${form.textfield_7!''}</span></td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\n" +
                "\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t<span style=\"font-size:16px;\"><span style=\"font-family:times new roman,times,serif;\"><span class=\"under_text\">(наименование лесничества)\n" +
                "\n" +
                "</span></span></span></td>\n" +
                "\t</tr>\n" +
                "\t</table>\n" +
                "\t<table>\n" +
                "\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tлесничеству, находящемуся по адресу <span class=\"under_line\"> ${form.textfield_15!''}</span></td>\n" +
                "\t\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\t</td>\n" +
                "\t\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(указывается адрес территориального отдела)</td>\n" +
                "\t\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t</td>\n" +
                "\t\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t</td>\n" +
                "\t\t</tr>\n" +
                "\t\n" +
                "\t</tbody>\n" +
                "</table>\n" +
                "<table>\n" +
                "<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tна автоматизированную, а также без использования средств автоматизации обработку моих персональных данных, включая сбор, запись, систематизацию, накопление, хранение, уточнение (обновление, изменение), извлечение, использование, передачу (распространение, предоставление, доступ), обезличивание, блокирование, удаление, уничтожение персональных данных, входящих в следующий перечень общедоступных сведений:</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tфамилия, имя, отчество; данные паспорта либо иного документа, удостоверяющего личность; адрес регистрации; абонентский номер; адрес электронной почты, данные доверенности - для представителя субъекта персональных данных;</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\t<span class=\"under_line\"> ${form.lastName!''} ${form.firstName!''} ${form.patronymic!''}, ${receiptStatics.declarantDocumentTypes[form.documentType!'NULL']} ${form.passportSeries!} ${form.passportNo!} ${form.dateOfIssue!} ${form.authority!}, ${form.residenceAddress!}, ${form.mobilePhone!}, ${form.email!} </span>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(указываются иные данные (по усмотрению субъекта персональных данных)</td>\n" +
                "\t\t\t\t</tr>\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t<td align=\"left\" width=\"15%\">\n" +
                "\t\t\t\tТакже выражаю согласие на получение и передачу моих персональных данных органам местного самоуправления, государственным органам и организациям для целей обеспечения соблюдения законов и иных нормативных правовых актов при предоставлении указанной государственной услуги. Настоящее согласие действует со дня его подписания до дня отзыва в письменной форме либо на период до истечения сроков хранения соответствующей информации или документов, содержащих указанную информацию, определяемых в соответствии с законодательством Российской Федерации.</td>\n" +
                "\t\t\t\t</tr>\n" +
                "</table>\n" +
                "<table width=\"100%\">\n" +
                "\t<tbody>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t\t<u>${form.lastName!''} ${form.firstName!''} ${form.patronymic!''}</u></td>\n" +
                "\t\t\t\n" +
                "\t\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t\t_________________________</td>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<td align=\"center\" width=\"15%\">\n" +
                "\t\t\t\t<u>${cDate?string('dd.MM.yyyy')}</u></td>\n" +
                "\t\t\t\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(Ф.И.О. заявителя)</td>\n" +
                "\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(подпись)</td>\n" +
                "\t\t\t<td align=\"center\" class=\"under_text\" width=\"15%\">\n" +
                "\t\t\t\t(дата)</td>\n" +
                "\t\t</tr>\n" +
                "\t</tbody>\n" +
                "</table>";
        String allHtml4=css4+htmlCode4;
        template_Arr.add(new Template_Model(name4,spec4,codeName4,allHtml4));
        return template_Arr;
    }
}
