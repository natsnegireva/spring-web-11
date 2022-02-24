package com.geekbrains.spring.web.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationPropertiesScan("integrations.cart-service.timeout")
@Data
public class TimeoutIntegrationProperties {
    private Integer connect;
    private Integer read;
    private Integer write;

}
