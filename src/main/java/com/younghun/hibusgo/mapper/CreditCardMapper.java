package com.younghun.hibusgo.mapper;

import com.younghun.hibusgo.domain.PaymentMeans;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreditCardMapper {

  PaymentMeans findById (long id);

  void addPaymentMeans(PaymentMeans paymentMeans);

  void updatePaymentMeans(PaymentMeans paymentMeans);

  void deletePaymentMeansByPaymentId(long paymentId);

}
