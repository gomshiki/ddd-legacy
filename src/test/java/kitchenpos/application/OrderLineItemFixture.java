package kitchenpos.application;

import kitchenpos.domain.Menu;
import kitchenpos.domain.OrderLineItem;

public class OrderLineItemFixture {

    public static OrderLineItem createOrderLineItemRequest(){
        final OrderLineItem orderLineItem = new OrderLineItem();
        final Menu menuRequest = MenuFixture.createMenuRequest();
        orderLineItem.setSeq(1L);
        orderLineItem.setMenuId(menuRequest.getId());
        orderLineItem.setQuantity(1L);
        orderLineItem.setMenu(menuRequest);
        return orderLineItem;
    }

    public static OrderLineItem createOrderLineItemRequest(final Menu menuRequest){
        final OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setSeq(1L);
        orderLineItem.setMenuId(menuRequest.getId());
        orderLineItem.setQuantity(1L);
        orderLineItem.setMenu(menuRequest);
        orderLineItem.setPrice(menuRequest.getPrice());
        return orderLineItem;
    }
}