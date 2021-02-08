package com.farben.chen.mapper;


import com.farben.chen.dao.ReceivableBill;
import com.farben.chen.dto.ReceivableDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceivableBillMapper {
    List<ReceivableBill>selectReceivableBill(ReceivableDto receivableDto);
}
