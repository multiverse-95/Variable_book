package variable_book.data;

import variable_book.model.Variable_Model;

import java.util.ArrayList;
// Класс в котором хранятся данные переменных
public class Variable_data {
    public ArrayList<Variable_Model> get_data_var(){
        ArrayList<Variable_Model> variable_Arr =new ArrayList<Variable_Model>();

        //Сведения о заявлении
        variable_Arr.add(new Variable_Model("Дата создания заявления","${cDate?string('dd.MM.yyyy')}"));
        variable_Arr.add(new Variable_Model("Время создания заявления","${cDate?string(\"HH\")}:${cDate?string(\"mm\")}"));
        variable_Arr.add(new Variable_Model("ФИО специалиста","${order.getUser().getDisplayName()!}"));
        variable_Arr.add(new Variable_Model("Должность специалиста","${order.getUser().getPosition()!}"));
        variable_Arr.add(new Variable_Model("Регистрационный номер заявления","${order.getOrderNumber()}"));
        variable_Arr.add(new Variable_Model("Наименование департамента","${order.getSubDepartment().getTitle()}"));
        variable_Arr.add(new Variable_Model("Наименование департамента","${order.mfc.getFullName()!\"\"}"));
        variable_Arr.add(new Variable_Model("",""));

        //Сведения о заявителе - физическом лице, в том числе индивидуальном предпринимателе

        variable_Arr.add(new Variable_Model("Фамилия, имя, отчество (Физ лицо)\nФИО физического лица",
                "${order.requester.displayName!\"\"} \nИЛИ ${form.lastName!} ${form.firstName!} ${form.patronymic!} \nИЛИ ${order.requester.lastName!''} ${order.requester.firstName!''} ${order.requester.patronymic!''}"));
        variable_Arr.add(new Variable_Model("Дата рождения (Физ лицо)","${order.requester.birthDate!\"\"} \nИЛИ ${form.birthDate!}"));
        variable_Arr.add(new Variable_Model("Место рождения (Физ лицо)","${order.requester.birthPlace!\"\"} \nИЛИ ${form.birthPlace!}"));
        variable_Arr.add(new Variable_Model("Документ, удостоверяющий личность (наименование и реквизиты) (Физ лицо) \n(Паспорт, Свидетельство о рождении, водительские права и т.д.)",
                "${order.requester.document.documentType.identityDocumentName!\"\"} ${order.requester.document.series!\"\"} ${order.requester.document.number!\"\"} ${order.requester.document.authority!\"\"} ${order.requester.document.dateOfIssue!\"\"} г. \nИЛИ номер и серия ${form.passportSeries!} ${form.passportNo!} выдан ${form.dateOfIssue!} ${form.authority!}"));
        variable_Arr.add(new Variable_Model("Адрес регистрации по месту жительства (месту пребывания) (Физ лицо)",
                "${order.requester.registrationAddress!\"\"}  \nИЛИ  ${form.registrationAddress!}"));
        variable_Arr.add(new Variable_Model("Адрес места жительства (Физ лицо)","${form.residenceAddress!}"));
        variable_Arr.add(new Variable_Model("Телефон (Физ лицо)","${form.mobilePhone!} \nИЛИ ${form.phoneNumber!''}"));
        variable_Arr.add(new Variable_Model("Email (Физ лицо)\nЭлектронная почта физического лица","${form.email!}"));
        variable_Arr.add(new Variable_Model("ИНН (Физ лицо)","${order.requester.getInn()!\"\"}"));
        variable_Arr.add(new Variable_Model("СНИЛС (Физ лицо)","${order.requester.snils!\"\"} \nИЛИ ${form.snils!}"));
        variable_Arr.add(new Variable_Model("ОГРНИП (Физ лицо)",
                "${form.additionalRequesters[0].OgrnIp}"));
        variable_Arr.add(new Variable_Model("",""));

        //Сведения о заявителе - юридическом лице

        variable_Arr.add(new Variable_Model("Полное наименование Юр.лица","${form.additionalRequesters[0].NameUl}"));
        variable_Arr.add(new Variable_Model("Сокращенное наименование (при наличии) Юр.лица","${form.additionalRequesters[0].ShortNameUl}"));
        variable_Arr.add(new Variable_Model("Адрес места нахождения юридического лица","${form.additionalRequesters[0].legalAddress!\"\"}"));
        variable_Arr.add(new Variable_Model("ИНН Юр.лица","${form.additionalRequesters[0].InnUl}"));
        variable_Arr.add(new Variable_Model("КПП Юр.лица","${form.additionalRequesters[0].KppUl}"));
        variable_Arr.add(new Variable_Model("ОГРН Юр.лица","${form.additionalRequesters[0].OgrnUl}"));
        variable_Arr.add(new Variable_Model("Почтовый адрес Юр.лица","${form.additionalRequesters[0].mailingAddress}"));
        variable_Arr.add(new Variable_Model("Электронная почта Юр.лица","${form.additionalRequesters[0].EmailUl}"));
        variable_Arr.add(new Variable_Model("",""));

        // Сведения о представителе заявителя

        variable_Arr.add(new Variable_Model("Фамилия, имя, отчество (при наличии) представителя заявителя\nФИО представителя заявителя",
                "${form.additionalRequesters[0].declarant_representative_lastName!\"\"} \n ${form.additionalRequesters[0].declarant_representative_firstName!\"\"} \n ${form.additionalRequesters[0].declarant_representative_patronymic!\"\"}\n"));
        variable_Arr.add(new Variable_Model("Документ, удостоверяющий личность (наименование документа и реквизиты документа) представителя заявителя \n(Паспорт, Свидетельство о рождении, водительские права и т.д.)",
                "<#if form.additionalRequesters[0].representative_check??> \n" +
                        "    ${receiptStatics.declarantDocumentTypes[form.additionalRequesters[0].declarant_representative_documentType!'NULL']} ${form.additionalRequesters[0].declarant_representative_documentSeries!\"\"\"\"} ${form.additionalRequesters[0].declarant_representative_documentNumber!\"\"\"\"} ${form.additionalRequesters[0].declarant_representative_documentAuthority!\"\"\"\"} ${form.additionalRequesters[0].declarant_representative_dateOfIssue!\"\"\"\"}\n" +
                        "   </#if>\n"));
        variable_Arr.add(new Variable_Model("Документ, подтверждающий полномочия представителя заявителя (наименование документа и реквизиты документа)\n(Паспорт, Свидетельство о рождении, водительские права и т.д.)",
                "<#if form.additionalRequesters[0].representative_check??> \n" +
                        "    ${form.additionalRequesters[0].declarant_representative_warrant_name} ${form.additionalRequesters[0].declarant_representative_warrant_number} ${form.additionalRequesters[0].declarant_representative_warrant_authority} ${form.additionalRequesters[0].declarant_representative_warrant_date}</font>\n" +
                        "   </#if>\n"));


        return variable_Arr;
    }

}
