package com.order.ordermgmt.repositories

import com.order.ordermgmt.models.ClientOrder
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientOrderRepository : CrudRepository<ClientOrder,Long>{
}