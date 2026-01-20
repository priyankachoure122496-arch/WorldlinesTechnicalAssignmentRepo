package com.example.worldline.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
@ConfigurationProperties(prefix = "cart.pricing")

public class CartPricingConfig {

    private Professional professional;
    private NonProfessional nonProfessional;

    @Data
    public static class Professional {
        private long revenueThreshold;

        public long getRevenueThreshold() {
            return revenueThreshold;
        }

        public void setRevenueThreshold(long revenueThreshold) {
            this.revenueThreshold = revenueThreshold;
        }

        public Price getAboveThreshold() {
            return aboveThreshold;
        }

        public void setAboveThreshold(Price aboveThreshold) {
            this.aboveThreshold = aboveThreshold;
        }

        public Price getBelowThreshold() {
            return belowThreshold;
        }

        public void setBelowThreshold(Price belowThreshold) {
            this.belowThreshold = belowThreshold;
        }

        private Price aboveThreshold;

        private Price belowThreshold;
    }

    @Data
    public static class NonProfessional {
        private double high;
        private double mid;
        private double lap;
    }

    @Data
    public static class Price {
        private double high;
        private double mid;
        private double lap;
    }
}
