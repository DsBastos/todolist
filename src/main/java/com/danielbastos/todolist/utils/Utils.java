package com.danielbastos.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

  public static void copyNonNullProperties(Object source, Object target) {

    BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
  }

  // get de todas as propriedades nulas.
  public static String[] getNullPropertyNames(Object source) {

    // Interface que fornecerá as propriedades
    final BeanWrapper src = new BeanWrapperImpl(source);
    // Wrapper Impl é a implementação da interface

    // Obtendo um array das propriedades do objeto
    PropertyDescriptor[] pds = src.getPropertyDescriptors();

    // Conjunto com as propriedades de valores nulos
    Set<String> emptyNames = new HashSet<>();

    for (PropertyDescriptor pd : pds) {
      // Obtendo o valor da propriedade atual
      Object srcValue = src.getPropertyValue(pd.getName());

      // Se for nula, adicionar o nome da propriedade no conjunto
      if (srcValue == null) {
        emptyNames.add(pd.getName());
      }
    }

    String[] result = new String[emptyNames.size()];

    return emptyNames.toArray(result);
  }
}
