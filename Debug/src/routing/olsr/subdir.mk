################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CC_SRCS += \
../src/routing/olsr/olsr-header.cc \
../src/routing/olsr/olsr-routing-protocol.cc \
../src/routing/olsr/olsr-state.cc 

OBJS += \
./src/routing/olsr/olsr-header.o \
./src/routing/olsr/olsr-routing-protocol.o \
./src/routing/olsr/olsr-state.o 

CC_DEPS += \
./src/routing/olsr/olsr-header.d \
./src/routing/olsr/olsr-routing-protocol.d \
./src/routing/olsr/olsr-state.d 


# Each subdirectory must supply rules for building sources it contributes
src/routing/olsr/%.o: ../src/routing/olsr/%.cc
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


