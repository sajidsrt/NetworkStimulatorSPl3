################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/applications/pathvector2/pathvector2.olg.cpp 

CC_SRCS += \
../src/applications/pathvector2/pathvector2.cc 

OBJS += \
./src/applications/pathvector2/pathvector2.o \
./src/applications/pathvector2/pathvector2.olg.o 

CC_DEPS += \
./src/applications/pathvector2/pathvector2.d 

CPP_DEPS += \
./src/applications/pathvector2/pathvector2.olg.d 


# Each subdirectory must supply rules for building sources it contributes
src/applications/pathvector2/%.o: ../src/applications/pathvector2/%.cc
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

src/applications/pathvector2/%.o: ../src/applications/pathvector2/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


